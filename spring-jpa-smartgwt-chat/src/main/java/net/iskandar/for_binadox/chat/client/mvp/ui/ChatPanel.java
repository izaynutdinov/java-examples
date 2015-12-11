package net.iskandar.for_binadox.chat.client.mvp.ui;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import net.iskandar.for_binadox.chat.client.ChatFacadeException;
import net.iskandar.for_binadox.chat.client.log.Logger;
import net.iskandar.for_binadox.chat.client.model.ChatModel;
import net.iskandar.for_binadox.chat.client.to.ChatMessageTo;
import net.iskandar.for_binadox.chat.client.to.UserTo;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.HTMLPane;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.ResizedEvent;
import com.smartgwt.client.widgets.events.ResizedHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

public class ChatPanel extends VLayout implements ChatModel.Listener, Resizeable {

	private static final Logger log = new Logger("ChatPanel");

	private TextArea textArea;
	private VLayout chatLog;
	private HTMLFlow latestChatItem;
	private DockPanel chatControl;
	private ChatModel chatModel;
	private Button button;
	private Integer chatId;

	private HandlerRegistration resizeHandler;

	private Timer scrollToBottom = new Timer(){

		@Override
		public void run() {
			chatLog.scrollToBottom();
		}

	};
	
	public ChatPanel(ChatModel chatModel) {
		super();

		this.chatModel = chatModel;
		chatModel.addListener(this);
		
		chatLog = new VLayout();
		chatLog.setWidth("100%");
		chatLog.setHeight("*");
		//chatLog.setBorder("1px green solid");
		//chatLog.setShowEdges(true);
		chatLog.setOverflow(Overflow.AUTO);
		
		//setShowEdges(true);

		chatControl = new DockPanel();
		chatControl.setStyleName("cw-DockPanel");
		chatControl.setWidth("100%");
		chatControl.setHeight("105px");		

		textArea = new TextArea();
		textArea.setWidth("400px");
		textArea.setHeight("87px");
		textArea.addStyleName("chat-textarea");

		button = new Button("Send");
		button.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				ChatPanel.this.chatModel.postMessage(textArea.getText());
				textArea.setText("");
				button.setEnabled(false);
			}
		});
		button.setWidth("95px");
		button.setHeight("95px");
		button.setEnabled(false);
		
		textArea.addKeyUpHandler(new KeyUpHandler() {
			@Override
			public void onKeyUp(KeyUpEvent event) {
				log.log("textArea.onKeyUp text=" + textArea.getText());
				button.setEnabled(!"".equals(textArea.getText()));
			}
		});

		chatControl.add(textArea, DockPanel.CENTER);
		chatControl.add(button, DockPanel.EAST);
		
//		chatControl.setMembers(textArea, button);
//		chatControl.setMembers(new BlueBox("*", null, "TEXTAREA"), new BlueBox("95px", null, "TEXTAREA"));
		addMember(chatLog);
		addMember(chatControl);
		
	}

	public void setChatId(Integer chatId){
		log.log("setChatId chatId=" + chatId);
		this.chatId = chatId;
		for(Canvas canvas : chatLog.getMembers())
			chatLog.removeChild(canvas);
		this.latestChatItem = null;
		chatModel.init(chatId, 0);		
	}

	@Override
	protected void onBind() {
		super.onBind();
		log.log("onBind");
	}
	
	@Override
	public void resize(int width, int height){
		log.log("resize");
		minimizeTextArea();
		setWidth(width);
		setHeight(height);
		int newWidth = (getWidth() - 140);
		ChatPanel.log.log("onResized newWidth=" + newWidth);
		textArea.setWidth(newWidth + "px");
		textArea.setHeight("87px");
	}

	@Override
	protected void onDraw() {
		super.onDraw();
		log.log("onDraw");
	}
	

	@Override
	protected void onAttach() {
		super.onAttach();
 		log.log("onAttach");
	}
	
	public void minimizeTextArea(){ // HACK CAN'T AVOID
		textArea.setSize("10px", "10px");
		//button.setSize("10px", "10px");
	}

	@Override
	public void newMessages(ChatModel sender, List<ChatMessageTo> messages) {
		for(ChatMessageTo message : messages){
			log.log("newMessage: from:" + message.getChatUser().getUser().getLogin() + ", text:" + message.getText());
			HTMLFlow flow = null;
			if(latestChatItem != null){
				flow = latestChatItem;
			} else {
				flow = new HTMLFlow();
				chatLog.addMember(flow);					
			}
			StringBuffer buf = new StringBuffer();
			String[] lines = message.getText().split("\n");
			for(int i = 0; i < lines.length; i++){
				if(i < (lines.length - 1))
					buf.append(lines[i] + "<br/>");
				else
					buf.append(lines[i]);
			}
			UserTo user = message.getChatUser().getUser();
			flow.setContents("<div class=\"chat-message\"><b>" + message.getTime().toString() + " " + user.getFirstName() + " " + user.getLastName() + " wrote:  </b>" + buf.toString() + "</div>");
	
			latestChatItem = new HTMLFlow();
			latestChatItem.setContents("<div style=\"width: 100%;height: 100px;\"></div>");
			chatLog.addMember(latestChatItem);
			//
			//messagesAdded.add(flow);
		}
		if(!messages.isEmpty()){
//			chatLog.scrollToBottom();
	 		if(scrollToBottom.isRunning())
				scrollToBottom.cancel();
			scrollToBottom.schedule(1);
		}
	}

	@Override
	public void chatError(ChatFacadeException error) {
		// TODO Auto-generated method stub
		
	}

}
