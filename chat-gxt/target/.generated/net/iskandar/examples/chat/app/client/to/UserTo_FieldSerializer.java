package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class UserTo_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getFirstName(net.iskandar.examples.chat.app.client.to.UserTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.UserTo::firstName;
  }-*/;
  
  private static native void setFirstName(net.iskandar.examples.chat.app.client.to.UserTo instance, java.lang.String value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.UserTo::firstName = value;
  }-*/;
  
  private static native java.lang.Integer getId(net.iskandar.examples.chat.app.client.to.UserTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.UserTo::id;
  }-*/;
  
  private static native void setId(net.iskandar.examples.chat.app.client.to.UserTo instance, java.lang.Integer value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.UserTo::id = value;
  }-*/;
  
  private static native java.lang.String getLastName(net.iskandar.examples.chat.app.client.to.UserTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.UserTo::lastName;
  }-*/;
  
  private static native void setLastName(net.iskandar.examples.chat.app.client.to.UserTo instance, java.lang.String value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.UserTo::lastName = value;
  }-*/;
  
  private static native java.lang.String getLogin(net.iskandar.examples.chat.app.client.to.UserTo instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.to.UserTo::login;
  }-*/;
  
  private static native void setLogin(net.iskandar.examples.chat.app.client.to.UserTo instance, java.lang.String value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.to.UserTo::login = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, net.iskandar.examples.chat.app.client.to.UserTo instance) throws SerializationException {
    setFirstName(instance, streamReader.readString());
    setId(instance, (java.lang.Integer) streamReader.readObject());
    setLastName(instance, streamReader.readString());
    setLogin(instance, streamReader.readString());
    
  }
  
  public static net.iskandar.examples.chat.app.client.to.UserTo instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new net.iskandar.examples.chat.app.client.to.UserTo();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, net.iskandar.examples.chat.app.client.to.UserTo instance) throws SerializationException {
    streamWriter.writeString(getFirstName(instance));
    streamWriter.writeObject(getId(instance));
    streamWriter.writeString(getLastName(instance));
    streamWriter.writeString(getLogin(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return net.iskandar.examples.chat.app.client.to.UserTo_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.UserTo_FieldSerializer.deserialize(reader, (net.iskandar.examples.chat.app.client.to.UserTo)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.to.UserTo_FieldSerializer.serialize(writer, (net.iskandar.examples.chat.app.client.to.UserTo)object);
  }
  
}
