package net.iskandar.for_binadox.chat.client.mvp.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ChatPlace extends Place {

	private String chatId;

	public ChatPlace(String chatId) {
		super();
		this.chatId = chatId;
	}

	public String getChatId() {
		return chatId;
	}

	@Prefix("chat")
	public static class Tokenizer implements PlaceTokenizer<ChatPlace> {

		@Override
		public ChatPlace getPlace(String token) {
			return new ChatPlace(token);
		}

		@Override
		public String getToken(ChatPlace place) {
			return place.getChatId();
		}
		
	}
	
	
	
	
	
}
