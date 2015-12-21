package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.mvp.places.ChatPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ChatPlace.Tokenizer.class})
public interface ChatPlacesHistoryMapper extends PlaceHistoryMapper {

}
