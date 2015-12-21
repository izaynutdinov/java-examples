package net.iskandar.examples.chat.app.client.mvp;

import com.google.gwt.place.impl.AbstractPlaceHistoryMapper;
import net.iskandar.examples.chat.app.client.mvp.ChatPlacesHistoryMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.impl.AbstractPlaceHistoryMapper.PrefixAndToken;
import com.google.gwt.core.client.GWT;

public class ChatPlacesHistoryMapperImpl extends AbstractPlaceHistoryMapper<Void> implements ChatPlacesHistoryMapper {
  
  protected PrefixAndToken getPrefixAndToken(Place newPlace) {
    if (newPlace instanceof net.iskandar.examples.chat.app.client.mvp.places.ChatPlace) {
      net.iskandar.examples.chat.app.client.mvp.places.ChatPlace place = (net.iskandar.examples.chat.app.client.mvp.places.ChatPlace) newPlace;
      PlaceTokenizer<net.iskandar.examples.chat.app.client.mvp.places.ChatPlace> t = GWT.create(net.iskandar.examples.chat.app.client.mvp.places.ChatPlace.Tokenizer.class);
      return new PrefixAndToken("chat", t.getToken((net.iskandar.examples.chat.app.client.mvp.places.ChatPlace) place));
    }
    return null;
  }
  
  protected PlaceTokenizer<?> getTokenizer(String prefix) {
    if ("chat".equals(prefix)) {
      return GWT.create(net.iskandar.examples.chat.app.client.mvp.places.ChatPlace.Tokenizer.class);
    }
    return null;
  }

}
