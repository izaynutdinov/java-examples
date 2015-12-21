package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ChatMessagesTo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getChatId(net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatMessagesTo::chatId;
  }-*/;
  
  private static native void setChatId(net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance, java.lang.Integer value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatMessagesTo::chatId = value;
  }-*/;
  
  private static native java.lang.Integer getLastMessageId(net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatMessagesTo::lastMessageId;
  }-*/;
  
  private static native void setLastMessageId(net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance, java.lang.Integer value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatMessagesTo::lastMessageId = value;
  }-*/;
  
  private static native java.util.List getMessages(net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatMessagesTo::messages;
  }-*/;
  
  private static native void setMessages(net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance, java.util.List value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatMessagesTo::messages = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance) throws SerializationException {
    setChatId(instance, (java.lang.Integer) streamReader.readObject());
    setLastMessageId(instance, (java.lang.Integer) streamReader.readObject());
    setMessages(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static net.iskandar.examples.chat.app.client.to.ChatMessagesTo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new net.iskandar.examples.chat.app.client.to.ChatMessagesTo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, net.iskandar.examples.chat.app.client.to.ChatMessagesTo instance) throws SerializationException {
    streamWriter.writeObject(getChatId(instance));
    streamWriter.writeObject(getLastMessageId(instance));
    streamWriter.writeObject(getMessages(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return net.iskandar.examples.chat.app.client.to.ChatMessagesTo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatMessagesTo_FieldSerializer.deserialize(reader, (net.iskandar.examples.chat.app.client.to.ChatMessagesTo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatMessagesTo_FieldSerializer.serialize(writer, (net.iskandar.examples.chat.app.client.to.ChatMessagesTo)object);
  }
  
}
