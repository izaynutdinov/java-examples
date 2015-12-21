package net.iskandar.examples.chat.smartgwt.client;

import java.util.List;

import net.iskandar.examples.chat.app.client.ChatFacadeException;
import net.iskandar.examples.chat.app.client.log.Logger;
import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.presenters.ChatPresenter;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.UserTo;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.layout.VLayout;

public class ChatPanel extends VLayout implements ChatView, Resizeable {

	private static final Logger log = new Logger(ChatPanel.class.getName());

	private ChatPresenter presenter;
	private TextArea textArea;
	private VLayout chatLog;
	private HTMLFlow latestChatItem;
	private DockPanel chatControl;
	private Button button;

	private Timer scrollToBottom = new Timer(){
		@Override
		public void run() {
			chatLog.scrollToBottom();
		}
	};

	public ChatPanel() {
		super();
		setPadding(0);
		setMargin(0);
		chatLog = new VLayout();
		chatLog.setWidth("100%");
		chatLog.setHeight("*");
		chatLog.setOverflow(Overflow.AUTO);

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
				presenter.postMessage(textArea.getText());
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
				button.setEnabled(!"".equals(textArea.getText()));
			}
		});

		chatControl.add(textArea, DockPanel.CENTER);
		chatControl.add(button, DockPanel.EAST);
		
		addMember(chatLog);
		addMember(chatControl);
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
	public Widget asWidget() {
		return this;
	}

	@Override
	public void setChatPresenter(ChatPresenter chatPresenter) {
		presenter = chatPresenter;
	}

	@Override
	public void clearMessages() {
		for(Canvas canvas : chatLog.getMembers())
			chatLog.removeChild(canvas);
		this.latestChatItem = null;	
	}

	@Override
	public void addMessage(String messageHtml) {
		HTMLFlow flow = null;
		if(latestChatItem != null){
			flow = latestChatItem;
		} else {
			flow = new HTMLFlow();
			chatLog.addMember(flow);					
		}
		flow.setContents(messageHtml);
		
		latestChatItem = new HTMLFlow();
		latestChatItem.setContents("<div style=\"width: 100%;height: 100px;\"></div>");
		chatLog.addMember(latestChatItem);
 		if(scrollToBottom.isRunning())
			scrollToBottom.cancel();
		scrollToBottom.schedule(1);
	}

}
