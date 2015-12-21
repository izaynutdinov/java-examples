package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ChatTo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDescription(net.iskandar.examples.chat.app.client.to.ChatTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatTo::description;
  }-*/;
  
  private static native void setDescription(net.iskandar.examples.chat.app.client.to.ChatTo instance, java.lang.String value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatTo::description = value;
  }-*/;
  
  private static native java.lang.Integer getId(net.iskandar.examples.chat.app.client.to.ChatTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatTo::id;
  }-*/;
  
  private static native void setId(net.iskandar.examples.chat.app.client.to.ChatTo instance, java.lang.Integer value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatTo::id = value;
  }-*/;
  
  private static native java.lang.String getTitle(net.iskandar.examples.chat.app.client.to.ChatTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.ChatTo::title;
  }-*/;
  
  private static native void setTitle(net.iskandar.examples.chat.app.client.to.ChatTo instance, java.lang.String value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.ChatTo::title = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, net.iskandar.examples.chat.app.client.to.ChatTo instance) throws SerializationException {
    setDescription(instance, streamReader.readString());
    setId(instance, (java.lang.Integer) streamReader.readObject());
    setTitle(instance, streamReader.readString());
    
  }
  
  public static net.iskandar.examples.chat.app.client.to.ChatTo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new net.iskandar.examples.chat.app.client.to.ChatTo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, net.iskandar.examples.chat.app.client.to.ChatTo instance) throws SerializationException {
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getTitle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return net.iskandar.examples.chat.app.client.to.ChatTo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatTo_FieldSerializer.deserialize(reader, (net.iskandar.examples.chat.app.client.to.ChatTo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.ChatTo_FieldSerializer.serialize(writer, (net.iskandar.examples.chat.app.client.to.ChatTo)object);
  }
  
}
