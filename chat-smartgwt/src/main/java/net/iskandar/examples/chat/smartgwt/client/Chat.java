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
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.grid.events.SelectionChangedHandler;
import com.smartgwt.client.widgets.grid.events.SelectionEvent;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tree.Tree;
import com.smartgwt.client.widgets.tree.TreeGrid;
import com.smartgwt.client.widgets.tree.TreeGridField;
import com.smartgwt.client.widgets.tree.TreeNode;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Chat implements EntryPoint {

	private static final Logger log = new Logger("Chat");

	private Label chatTitleLabel;
	private String chatTitle;
	private String nodeId;

	private Timer treeSelectionTimer = new Timer(){
		@Override
		public void run() {
			log.log("treeSelectionTimer.run id=" + nodeId);
			try {
				int id = Integer.parseInt(nodeId);
				chatTitleLabel.setContents(chatTitle);
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
				ChatTo chat = null;
				if(result.size() > 0){
					chat = result.get(0);
				}
				Window.enableScrolling(false);
				Window.setMargin("0px");

				final VLayout mainLayout = new VLayout();
				mainLayout.setWidth100();
				mainLayout.setHeight100();
				VLayout header  = new VLayout();
				header.setWidth100();
				header.setHeight("50px");
				header.addMember(new HTMLFlow("<div class=\"chat-title\">Chat App Using Smart GWT</div>"));

				final HLayout splitLayout = new HLayout();
				splitLayout.setMargin(0);
				splitLayout.setBorder("2px solid gray");
				splitLayout.setPadding(5);
				splitLayout.setWidth100();
				splitLayout.setHeight("*");

				TreeGrid menu = createTree(result);

				VLayout body = new VLayout();
				body.setWidth("*");
				body.setHeight100();
				body.setMargin(0);
				body.setBorder("1px #ABABAB solid");

				chatTitleLabel = new Label();
				chatTitleLabel.setWidth100();
				chatTitleLabel.setHeight("15px");
				chatTitleLabel.setStyleName("chat-title-label");
				if(chat != null) {
					chatTitleLabel.setContents(chat.getTitle());
				}

				final CenterPanel centerPanel = new CenterPanel();
				centerPanel.setMargin(0);
				centerPanel.setPadding(0);
				centerPanel.setWidth100();
				centerPanel.setHeight100();
				
				
				body.setMembers(chatTitleLabel, centerPanel);

				splitLayout.setMembers(menu, body);
				
				mainLayout.setMembers(header, splitLayout);				
				
				RootPanel.get().add(mainLayout);
				
				chatApplication.setChatMessageRenderer(new ChatMessageRendererImpl());
				if(chat != null)
					chatApplication.setDefaultChatId(chat.getId());
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
				chatTitle = event.getSelectedRecord().getAttribute("TITLE");
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
