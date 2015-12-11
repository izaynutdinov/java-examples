package net.iskandar.for_binadox.chat.client.mvp;

import net.iskandar.for_binadox.chat.client.mvp.activities.ChatActivity;
import net.iskandar.for_binadox.chat.client.mvp.places.ChatPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class ChatActivityMapper implements ActivityMapper {

	private ClientFactory clientFactory;
	
	public ChatActivityMapper(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if(place instanceof ChatPlace){
			return new ChatActivity((ChatPlace) place, clientFactory);
		}
		return null;
	}

}
