package net.iskandar.examples.chat.gxt.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import net.iskandar.examples.chat.app.client.log.Logger;
import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.resources.Resources;
import net.iskandar.examples.chat.app.client.to.ChatTo;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.data.shared.IconProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent.SelectionChangedHandler;
import com.sencha.gxt.widget.core.client.tree.Tree;

public class Chat implements EntryPoint {

	private static final Logger log = new Logger(Chat.class.getName());
	private String chatTitle;
	private String nodeId;	
	private ChatApplication chatApplication;
	private Label chatTitleLabel;
	private Tree<TreeItem, String> tree;	
 

	private Timer treeSelectionTimer = new Timer(){
		@Override
		public void run() {
			log.log("treeSelectionTimer.run id=" + nodeId);
			try {
				int id = Integer.parseInt(nodeId);
				chatTitleLabel.setText(chatTitle);
				History.newItem("chat:" + id);
			} catch(NumberFormatException nfe) {
				;
			}
		}
	};
	
	private Timer treeExpandTimer = new Timer(){

		@Override
		public void run() {
			tree.expandAll();
		}
		
	};

	@Override
	public void onModuleLoad() {
		chatApplication = GWT.create(ChatApplication.class);
		chatApplication.getChatFacade().getChats(new AsyncCallback<List<ChatTo>>(){


			@Override
			public void onFailure(Throwable caught) {
				log.log("getChats.onFailure exception=" + caught.getClass().getName() + ", message=" + caught.getMessage());
			}

			@Override
			public void onSuccess(List<ChatTo> result) {
				ChatTo chat = null;
				if(result.size() > 0)
					chat = result.get(0);
				Viewport viewport = new Viewport();
				viewport.addStyleName("x-viewport");

				BorderLayoutContainer borderLayoutContainer = new BorderLayoutContainer();
		        borderLayoutContainer.setBorders(true);

		        BorderLayoutContainer north = new BorderLayoutContainer();
		        north.setStyleName("north-panel");
		        HTML title = new HTML("<div class=\"chat-title\">Chat App Using Sencha GXT</div>");
		        MarginData titleData = new MarginData();
		        
		        HTML menu = new HTML("<a class=\"menu-item\" href=\"login.mvc\">Sign Out</a>");
		        
		        north.setCenterWidget(title, titleData);
		        north.setEastWidget(menu, new BorderLayoutContainer.BorderLayoutData(150));

		        BorderLayoutContainer.BorderLayoutData northData = new BorderLayoutContainer.BorderLayoutData(150);
		        northData.setCollapsible(false);
		        northData.setSplit(false);
		        northData.setCollapseMini(false);
		        northData.setMargins(new Margins(0, 5, 0, 5));
		        northData.setSize(50);

		        ContentPanel west = new ContentPanel();
				tree = createTree(result);		        
		        west.add(tree);

		        BorderLayoutContainer.BorderLayoutData westData = new BorderLayoutContainer.BorderLayoutData(150);
		        westData.setCollapsible(true);
		        westData.setSplit(true);
		        westData.setCollapseMini(true);
		        westData.setMargins(new Margins(0, 5, 0, 5));

		        BorderLayoutContainer body = new BorderLayoutContainer();

		        chatTitleLabel = new Label();
		        chatTitleLabel.setStyleName("chat-title-label");
		        
		        if(chat != null)
		        	chatTitleLabel.setText(chat.getTitle());

		        BorderLayoutContainer.BorderLayoutData chatTitleLabelData = new BorderLayoutContainer.BorderLayoutData(250);
		        chatTitleLabelData.setCollapsible(false);
		        chatTitleLabelData.setSplit(false);
		        chatTitleLabelData.setCollapseMini(false);
		        chatTitleLabelData.setMargins(new Margins(0, 5, 0, 5));
		        chatTitleLabelData.setSize(30);


		        ContentPanel center = new ContentPanel();
		        center.setHeaderVisible(false);
		        MarginData centerData = new MarginData();
		        
		        body.setNorthWidget(chatTitleLabel, chatTitleLabelData);
		        body.setCenterWidget(center, new MarginData());

		        borderLayoutContainer.setNorthWidget(north, northData);
		        borderLayoutContainer.setWestWidget(west, westData);
		        borderLayoutContainer.setCenterWidget(body, new MarginData());

		        viewport.add(borderLayoutContainer);
				RootPanel.get().add(viewport);
				if(chat != null)
					chatApplication.setDefaultChatId(chat.getId());
				chatApplication.init(center, new ViewFactoryImpl());
				treeExpandTimer.schedule(100);
			}
		});
	}

	public Tree<TreeItem, String> createTree(List<ChatTo> chats){
		TreeStore<TreeItem> store = new TreeStore<TreeItem>(new KeyProvider());
		TreeItem myChats = new TreeItem("My Chats");
		store.add(myChats);
		Iterator<ChatTo> iter = chats.iterator();
		TreeItem tiFirst = null;
		if(iter.hasNext()){
			tiFirst = new TreeItem(iter.next());
			store.add(myChats, tiFirst);
			while(iter.hasNext()){
				ChatTo chat = iter.next();
				store.add(myChats, new TreeItem(chat));				
			}
		}

		final Tree<TreeItem, String> tree = new Tree<TreeItem, String>(store,	new ValueProvider<TreeItem, String>() {
			@Override
			public String getValue(TreeItem object) {
				return object.getTitle();
			}

			@Override
			public void setValue(TreeItem object, String value) {
				// TODO Auto-generated method stub
			}

			@Override
			public String getPath() {
				// TODO Auto-generated method stub
				return "title";
			}
		});
		tree.getSelectionModel().addSelectionChangedHandler(new SelectionChangedHandler<TreeItem>() {
			@Override
			public void onSelectionChanged(
					SelectionChangedEvent<TreeItem> event) {
				if(treeSelectionTimer.isRunning())
					treeSelectionTimer.cancel();
				if(event.getSelection().get(0).getChat() != null){
					nodeId = event.getSelection().get(0).getId().toString();
					chatTitle = event.getSelection().get(0).getTitle().toString();
					treeSelectionTimer.schedule(1000);
				}
			}
		});
		tree.getSelectionModel().setSelection(Arrays.asList(tiFirst));
		tree.setExpanded(tiFirst, true);
		tree.setIconProvider(new IconProvider<TreeItem>(){

			@Override
			public ImageResource getIcon(TreeItem model) {
				if(model.getChat() != null)
					return Resources.INSTANCE.chatIcon();
				return Resources.INSTANCE.folderIcon();
			}
			
		});
		return tree;
	}

	class KeyProvider implements ModelKeyProvider<TreeItem> {
		@Override
		public String getKey(TreeItem item) {
			return item.getId().toString();
		}
	}
	
	private class TreeItem {
		private Integer id;
		private String title;
		private ChatTo chat;
		private List<TreeItem> children = new ArrayList<TreeItem>();
		
		public TreeItem(String title) {
			super();
			this.id = -1;
			this.title = title;
		}
		
		public TreeItem(ChatTo chat) {
			super();
			this.id = chat.getId();
			this.title = chat.getTitle();			
			this.chat = chat;
		}



		public Integer getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public ChatTo getChat() {
			return chat;
		}
		
	}

}
