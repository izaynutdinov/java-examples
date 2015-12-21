package net.iskandar.examples.chat.gxt.client;

import java.util.List;

import net.iskandar.examples.chat.app.client.ChatFacadeException;
import net.iskandar.examples.chat.app.client.log.Logger;
import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.presenters.ChatPresenter;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.UserTo;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.TextArea;

public class ChatPanel extends BorderLayoutContainer implements ChatView {

	private ChatPresenter presenter;
	private ScrollPanel scrollPanel;
	private VerticalPanel chatLog;
	private TextArea messageText;
	private TextButton button;
	private HTML lastHTML = null;

	private static final Logger log = new Logger(ChatPanel.class.getName());

	public ChatPanel() {
		super();

		scrollPanel = new ScrollPanel();
		chatLog = new VerticalPanel();
		chatLog.setStyleName("chat-log");
		scrollPanel.add(chatLog);
		scrollPanel.setStyleName("chat-scroll-panel");
		
		MarginData chatLogData = new MarginData();
		
		BorderLayoutContainer controls = new BorderLayoutContainer();
		messageText = new TextArea();
		MarginData messageTextData = new MarginData(5);  

		button = new TextButton("Send");
		button.disable();

		BorderLayoutData buttonData = new BorderLayoutData();
		buttonData.setSize(100);
		buttonData.setMargins(new Margins(5));
		
		controls.setEastWidget(button, buttonData);
		controls.setCenterWidget(messageText, messageTextData);
		
		BorderLayoutData controlsData = new BorderLayoutData();
		controlsData.setSize(100);
		
		setCenterWidget(scrollPanel, chatLogData);
		setSouthWidget(controls, controlsData);
		
		button.addSelectHandler(new SelectEvent.SelectHandler() {
			@Override
			public void onSelect(SelectEvent event) {
				presenter.postMessage(messageText.getText());
				messageText.setText("");
				messageText.focus();
				button.disable();
			}
		});
		messageText.addKeyUpHandler(new KeyUpHandler() {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				button.setEnabled(!"".equals(messageText.getText()));
			}
		});
	}

	@Override
	public void setChatPresenter(ChatPresenter chatPresenter) {
		presenter = chatPresenter;
	}

	@Override
	public void clearMessages() {
		chatLog.clear();
		lastHTML = null;		
	}

	@Override
	public void addMessage(String messageHtml) {
		HTML html = null;
		if(lastHTML != null)
			html = lastHTML;
		else {
			lastHTML = new HTML();
			html = lastHTML;
			chatLog.add(html);
		}
		html.setHTML(messageHtml);
		lastHTML = new HTML("<div style=\"width: 100%;height: 100px;\"></div>");
		chatLog.add(lastHTML);
		scrollPanel.scrollToBottom();		
	}

}
