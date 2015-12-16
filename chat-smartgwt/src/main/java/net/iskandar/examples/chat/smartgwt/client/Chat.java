package net.iskandar.examples.chat.smartgwt.client;

import java.util.List;

import net.iskandar.examples.chat.app.client.log.Logger;
import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.to.ChatTo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.types.TreeModelType;
import com.smartgwt.client.widgets.grid.events.SelectionChangedHandler;
import com.smartgwt.client.widgets.grid.events.SelectionEvent;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.tree.Tree;
import com.smartgwt.client.widgets.tree.TreeGrid;
import com.smartgwt.client.widgets.tree.TreeGridField;
import com.smartgwt.client.widgets.tree.TreeNode;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Chat implements EntryPoint {

	private static final Logger log = new Logger("Chat");
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

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final ChatApplication chatApplication = GWT.create(ChatApplication.class);
		chatApplication.getChatFacade().getChats(new AsyncCallback<List<ChatTo>>() {

			@Override
			public void onFailure(Throwable caught) {
				log.log("getChats FAILED!");
			}

			@Override
			public void onSuccess(List<ChatTo> result) {
				
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
				centerPanel.setMargin(0);
				centerPanel.setPadding(0);
				centerPanel.setWidth("*");
				centerPanel.setHeight("100%");

				mainLayout.setMembers(menu, centerPanel);
				RootPanel.get().add(mainLayout);
				
				chatApplication.init(centerPanel, new ViewFactoryImpl());				

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
