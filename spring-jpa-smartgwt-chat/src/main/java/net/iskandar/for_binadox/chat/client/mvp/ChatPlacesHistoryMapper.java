package net.iskandar.for_binadox.chat.client.mvp;

import net.iskandar.for_binadox.chat.client.mvp.places.ChatPlace;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ChatPlace.Tokenizer.class})
public interface ChatPlacesHistoryMapper extends PlaceHistoryMapper {

}
