package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ChatMessageTo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native net.iskandar.examples.chat.app.client.to.ChatUserTo getChatUser(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::chatUser;
  }-*/;
  
  private static native void setChatUser(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance, net.iskandar.examples.chat.app.client.to.ChatUserTo value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::chatUser = value;
  }-*/;
  
  private static native java.lang.Integer getId(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::id;
  }-*/;
  
  private static native void setId(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance, java.lang.Integer value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::id = value;
  }-*/;
  
  private static native java.lang.String getText(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::text;
  }-*/;
  
  private static native void setText(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance, java.lang.String value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::text = value;
  }-*/;
  
  private static native java.lang.String getTime(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::time;
  }-*/;
  
  private static native void setTime(net.iskandar.examples.chat.app.client.to.ChatMessageTo instance, java.lang.String value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatMessageTo::time = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, net.iskandar.examples.chat.app.client.to.ChatMessageTo instance) throws SerializationException {
    setChatUser(instance, (net.iskandar.examples.chat.app.client.to.ChatUserTo) streamReader.readObject());
    setId(instance, (java.lang.Integer) streamReader.readObject());
    setText(instance, streamReader.readString());
    setTime(instance, streamReader.readString());
    
  }
  
  public static net.iskandar.examples.chat.app.client.to.ChatMessageTo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new net.iskandar.examples.chat.app.client.to.ChatMessageTo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, net.iskandar.examples.chat.app.client.to.ChatMessageTo instance) throws SerializationException {
    streamWriter.writeObject(getChatUser(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getText(instance));
    streamWriter.writeString(getTime(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return net.iskandar.examples.chat.app.client.to.ChatMessageTo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatMessageTo_FieldSerializer.deserialize(reader, (net.iskandar.examples.chat.app.client.to.ChatMessageTo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatMessageTo_FieldSerializer.serialize(writer, (net.iskandar.examples.chat.app.client.to.ChatMessageTo)object);
  }
  
}
