package net.iskandar.examples.chat.app.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ChatFacadeException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode getErrorCode(net.iskandar.examples.chat.app.client.ChatFacadeException instance) /*-{
    return instance.@net.iskandar.examples.chat.app.client.ChatFacadeException::errorCode;
  }-*/;
  
  private static native void setErrorCode(net.iskandar.examples.chat.app.client.ChatFacadeException instance, net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode value) 
  /*-{
    instance.@net.iskandar.examples.chat.app.client.ChatFacadeException::errorCode = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, net.iskandar.examples.chat.app.client.ChatFacadeException instance) throws SerializationException {
    setErrorCode(instance, (net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode) streamReader.readObject());
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static net.iskandar.examples.chat.app.client.ChatFacadeException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new net.iskandar.examples.chat.app.client.ChatFacadeException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, net.iskandar.examples.chat.app.client.ChatFacadeException instance) throws SerializationException {
    streamWriter.writeObject(getErrorCode(instance));
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return net.iskandar.examples.chat.app.client.ChatFacadeException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.ChatFacadeException_FieldSerializer.deserialize(reader, (net.iskandar.examples.chat.app.client.ChatFacadeException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.ChatFacadeException_FieldSerializer.serialize(writer, (net.iskandar.examples.chat.app.client.ChatFacadeException)object);
  }
  
}
