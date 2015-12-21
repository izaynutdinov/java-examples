package net.iskandar.examples.chat.app.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ChatFacadeException_ErrorCode_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode[] values = net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return net.iskandar.examples.chat.app.client.ChatFacadeException_ErrorCode_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.ChatFacadeException_ErrorCode_FieldSerializer.deserialize(reader, (net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    net.iskandar.examples.chat.app.client.ChatFacadeException_ErrorCode_FieldSerializer.serialize(writer, (net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode)object);
  }
  
}
