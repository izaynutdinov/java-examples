package net.iskandar.examples.chat.app.client.mvp;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import net.iskandar.examples.chat.app.client.mvp.places.ChatPlace;

@WithTokenizers({ChatPlace.Tokenizer.class})
public interface ChatPlacesHistoryMapper extends PlaceHistoryMapper {

}
