package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.mvp.activities.ChatActivity;
import net.iskandar.examples.chat.app.client.mvp.places.ChatPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class ChatActivityMapper implements ActivityMapper {

	private ChatApplicationInternal chatApplication;

	public ChatActivityMapper(ChatApplicationInternal chatApplication) {
		super();
		this.chatApplication = chatApplication;
	}

	@Override
	public Activity getActivity(Place place) {
		if(place instanceof ChatPlace){
			return new ChatActivity((ChatPlace) place, chatApplication);
		}
		return null;
	}

}
