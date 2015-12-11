package net.iskandar.for_binadox.chat.client;

import java.util.List;

import net.iskandar.for_binadox.chat.client.log.Logger;
import net.iskandar.for_binadox.chat.client.mvp.ChatActivityMapper;
import net.iskandar.for_binadox.chat.client.mvp.ChatPlacesHistoryMapper;
import net.iskandar.for_binadox.chat.client.mvp.ClientFactory;
import net.iskandar.for_binadox.chat.client.mvp.places.ChatPlace;
import net.iskandar.for_binadox.chat.client.mvp.ui.CenterPanel;
import net.iskandar.for_binadox.chat.client.mvp.ui.ChatPanel;
import net.iskandar.for_binadox.chat.client.to.ChatMessageTo;
import net.iskandar.for_binadox.chat.client.to.ChatTo;

import com.codeveo.gwt.stomp.client.Message;
import com.codeveo.gwt.stomp.client.MessageListener;
import com.codeveo.gwt.stomp.client.StompClient;
import com.codeveo.gwt.stomp.client.StompJS;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.types.TreeModelType;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.events.ResizedEvent;
import com.smartgwt.client.widgets.events.ResizedHandler;
import com.smartgwt.client.widgets.grid.events.SelectionChangedHandler;
import com.smartgwt.client.widgets.grid.events.SelectionEvent;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tree.Tree;
import com.smartgwt.client.widgets.tree.TreeGrid;
import com.smartgwt.client.widgets.tree.TreeGridField;
import com.smartgwt.client.widgets.tree.TreeNode;

public class Initializer3Impl implements Initializer {

	private static final Logger log = new Logger(
			Initializer3Impl.class.getSimpleName());

	private static final ClientFactory clientFactory = GWT
			.create(ClientFactory.class);

	private String nodeId;
	
	private Timer treeSelectionTimer = new Timer(){
		@Override
		public void run() {
			log.log("treeSelectionTimer.run id=" + nodeId);
			try {
				int id = Integer.parseInt(nodeId);
				History.newItem("chat:" + id);
			} catch(NumberFormatException nfe){
				;
			}
		}
	};
	
	private static final Place defaultPlace = new ChatPlace("1");
	

	@Override
	public void initApp() {
		StompJS.install();

		Window.enableScrolling(false);
		clientFactory.chatFacade().getChats(new AsyncCallback<List<ChatTo>>() {

			@Override
			public void onFailure(Throwable caught) {
				log.log("getChats FAILED!");
			}

			@Override
			public void onSuccess(List<ChatTo> result) {

				final ChatPanel chatPanel = clientFactory.chatPanel();
				chatPanel.setMargin(10);
//				chatPanel.setBorder("2px solid red");
				chatPanel.setVisible(false);
				chatPanel.getElement().addClassName("chat-panel");
				
				final HLayout mainLayout = new HLayout();
				mainLayout.setMargin(0);
				mainLayout.setBorder("2px solid gray");				
				mainLayout.setWidth(Window.getClientWidth() - 15);
				mainLayout.setHeight(Window.getClientHeight() - 30);
				Window.addResizeHandler(new ResizeHandler() {

					@Override
					public void onResize(ResizeEvent event) {
						log.log("onWindowResizeHandler");
						int newWidth = Window.getClientWidth() - 15;
						int newHeight = Window.getClientHeight() - 30;
						log.log("onResize newWidth=" + newWidth
								+ ", newHeight=" + newHeight);
						mainLayout.setWidth(newWidth);
						mainLayout.setHeight(newHeight);
					}

				});
				TreeGrid menu = createTree(result);

				final CenterPanel centerPanel = new CenterPanel();
//				centerPanel.setBorder("2px solid red");
				centerPanel.setMargin(0);
				centerPanel.setPadding(0);
				centerPanel.setWidth("*");
				centerPanel.setHeight("100%");

//				centerPanel.setMembers(chatPanel);
				mainLayout.setMembers(menu, centerPanel);
				RootPanel.get().add(mainLayout);

				PlaceController placeController = clientFactory.placeController();
				ChatActivityMapper activityMapper = new ChatActivityMapper(clientFactory);				
				ActivityManager activityManager = new ActivityManager(activityMapper, clientFactory.eventBus());
				activityManager.setDisplay(centerPanel);

				ChatPlacesHistoryMapper historyMapper= GWT.create(ChatPlacesHistoryMapper.class);
		        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		        historyHandler.register(placeController, clientFactory.eventBus(), defaultPlace);				

		        historyHandler.handleCurrentHistory();		        
			}

		});

	}
	
	private TreeGrid createTree(List<ChatTo> chats){
		Tree chatsTree = new Tree();
		chatsTree.setModelType(TreeModelType.CHILDREN);
		chatsTree.setNameProperty("TITLE");
		chatsTree.setChildrenProperty("CHATS");
		chatsTree.setRoot(createTreeFromChats(chats));
		
		TreeGrid menu = new TreeGrid();
		menu.setWidth("150px");
		menu.setShowResizeBar(true);
		menu.setShowHeader(false);
		menu.setShowEdges(false);
		//menu.setBorder("1px solid orange");
		menu.setFolderIcon("icons/folder.png");
		menu.setNodeIcon("icons/chat.png");
		menu.setShowOpenIcons(false);  
        menu.setShowDropIcons(false);  
        menu.setClosedIconSuffix("");				
		menu.setFields(new TreeGridField("TITLE"));
		menu.setData(chatsTree);
		menu.addSelectionChangedHandler(new SelectionChangedHandler() {
			@Override
			public void onSelectionChanged(SelectionEvent event) {
				log.log("onSelectionChanged");
				nodeId = event.getSelectedRecord().getAttribute("ID");
				if(treeSelectionTimer.isRunning())
					treeSelectionTimer.cancel();
				treeSelectionTimer.schedule(1000);
			}
		});
		menu.getData().openAll();
		return menu;
	}
	
	
	private static TreeNode createTreeFromChats(List<ChatTo> chats){
		ChatsTreeNode[] children = new ChatsTreeNode[chats.size()];
		int i = 0;
		for(ChatTo chat : chats){
			children[i] = new ChatsTreeNode(chat.getId().toString(), chat.getTitle(), new ChatsTreeNode[]{});
			i++;
		}
		return new ChatsTreeNode("ROOT", "ROOT", new ChatsTreeNode("MY_CHATS", "My Chats", children));
	}
	
	private static class ChatsTreeNode extends TreeNode {
		ChatsTreeNode(String id, String title, ChatsTreeNode... children){
			setAttribute("ID", id);
			setAttribute("TITLE", title);
			if(children.length > 0)
				setAttribute("CHATS", children);
		}
	}

}
