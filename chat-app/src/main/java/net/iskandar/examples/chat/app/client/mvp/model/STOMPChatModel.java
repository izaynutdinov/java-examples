package net.iskandar.examples.chat.app.client.mvp.model;

import java.util.Arrays;

import net.iskandar.examples.chat.app.client.Utils;
import net.iskandar.examples.chat.app.client.log.Logger;
import net.iskandar.examples.chat.app.client.mvp.ChatApplicationInternal;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;

import com.codeveo.gwt.stomp.client.Message;
import com.codeveo.gwt.stomp.client.MessageListener;
import com.codeveo.gwt.stomp.client.StompClient;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Document;

public class STOMPChatModel extends BaseChatModelImpl {

	private static final Logger log = new Logger(STOMPChatModel.class.getSimpleName());
	private StompClient stompClient;

//	private static Pattern pattern = Pattern.compile("http://([a-z]*):([0-9]*)([/ \\- a-z]{1,1}[/ \\- a-z 0-9]*)");

	public STOMPChatModel(ChatApplicationInternal chatApplication) {
		super(chatApplication);
	}

	@Override
	protected void doBeforeInit() {
		log.log("initApp");
		String baseUrl = GWT.getHostPageBaseURL();

		// Ugly hack to parse url
		AnchorElement a = Document.get().createAnchorElement();
		a.setHref(baseUrl);
		log.log("host: " + a.getPropertyString("host"));
		log.log("port: " + a.getPropertyString("port"));
		log.log("pathname: " + a.getPropertyString("pathname"));
		String stompUrl = "http://" + a.getPropertyString("host") + a.getPropertyString("pathname") + "app/stomp";
		log.log("stompUrl: " + stompUrl);
		a.removeFromParent();

		if(stompClient == null){
			stompClient = new StompClient(stompUrl, new StompClient.Callback() {
				@Override
				public void onError(String cause) {
					log.log("ERROR: cause=" + cause);
				}

				@Override
				public void onDisconnect() {
					// TODO Auto-generated method stub
				}

				@Override
				public void onConnect() {
					log.log("stompClient.onConnect");
					subscribe();
				}
			}, true, true);
			log.log("About to connect to stomp!");
			stompClient.connect();
		} else {
			stompClient.disconnect();
			stompClient.connect();
		}
	}
	
	private void subscribe(){
		stompClient.subscribe("/chats/" + getChatId(), new MessageListener() {
			@Override
			public void onMessage(Message message) {
//				log.log("stompClient.onMessage: json = " + message.getBody());
				ChatMessageTo chatMessage = Utils.parseChatMessageTo(message.getBody());
				log.log("stompClient.onMessage: " + chatMessage.toString());
				onNewMessages(Arrays.asList(chatMessage));
			}
		});
	}

	@Override
	protected void doAfterInit() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void doBeforePostMessage() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void doAfterPostMessage() {
		// TODO Auto-generated method stub
	}

	
	public static void main(String[] args){
/*		System.out.println("START");
//		Pattern pattern = Pattern.compile("http://([a-z]):");
		String baseURL = "http://localhost:8080/chat-smartgwt/app/test12/";
		Matcher matcher = pattern.matcher(baseURL);
		if(matcher.find()){
			System.out.println("WHOLE MATCH: " + matcher.group(0));
			System.out.println("HOST: " + matcher.group(1));
			System.out.println("PORT: " + matcher.group(2));
			System.out.println("PATH: " + matcher.group(3));			
			System.out.println("FOUND");
		}*/
	}
	
}
