package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ChatUserTo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Integer getChatId(net.iskandar.examples.chat.app.client.to.ChatUserTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatUserTo::chatId;
  }-*/;
  
  private static native void setChatId(net.iskandar.examples.chat.app.client.to.ChatUserTo instance, java.lang.Integer value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatUserTo::chatId = value;
  }-*/;
  
  private static native java.lang.Integer getId(net.iskandar.examples.chat.app.client.to.ChatUserTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatUserTo::id;
  }-*/;
  
  private static native void setId(net.iskandar.examples.chat.app.client.to.ChatUserTo instance, java.lang.Integer value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatUserTo::id = value;
  }-*/;
  
  private static native net.iskandar.examples.chat.app.client.to.UserTo getUser(net.iskandar.examples.chat.app.client.to.ChatUserTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatUserTo::user;
  }-*/;
  
  private static native void setUser(net.iskandar.examples.chat.app.client.to.ChatUserTo instance, net.iskandar.examples.chat.app.client.to.UserTo value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatUserTo::user = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, net.iskandar.examples.chat.app.client.to.ChatUserTo instance) throws SerializationException {
    setChatId(instance, (java.lang.Integer) streamReader.readObject());
    setId(instance, (java.lang.Integer) streamReader.readObject());
    setUser(instance, (net.iskandar.examples.chat.app.client.to.UserTo) streamReader.readObject());
    
  }
  
  public static net.iskandar.examples.chat.app.client.to.ChatUserTo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new net.iskandar.examples.chat.app.client.to.ChatUserTo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, net.iskandar.examples.chat.app.client.to.ChatUserTo instance) throws SerializationException {
    streamWriter.writeObject(getChatId(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeObject(getUser(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return net.iskandar.examples.chat.app.client.to.ChatUserTo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatUserTo_FieldSerializer.deserialize(reader, (net.iskandar.examples.chat.app.client.to.ChatUserTo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatUserTo_FieldSerializer.serialize(writer, (net.iskandar.examples.chat.app.client.to.ChatUserTo)object);
  }
  
}
