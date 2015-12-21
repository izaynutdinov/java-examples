package net.iskandar.examples.chat.app.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class ChatFacade_Proxy extends RemoteServiceProxy implements net.iskandar.examples.chat.app.client.ChatFacadeAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "net.iskandar.examples.chat.app.client.ChatFacade";
  private static final String SERIALIZATION_POLICY ="C945F4A972A5D97960B6260651DF2862";
  private static final net.iskandar.examples.chat.app.client.ChatFacade_TypeSerializer SERIALIZER = new net.iskandar.examples.chat.app.client.ChatFacade_TypeSerializer();
  
  public ChatFacade_Proxy() {
    super(GWT.getModuleBaseURL(),
      "facade", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getChatMessages(java.lang.Integer chatId, int days, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ChatFacade_Proxy", "getChatMessages");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.Integer/3438268394");
      streamWriter.writeString("I");
      streamWriter.writeObject(chatId);
      streamWriter.writeInt(days);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getChatUsers(java.lang.Integer chatId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ChatFacade_Proxy", "getChatUsers");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.Integer/3438268394");
      streamWriter.writeObject(chatId);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getChats(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ChatFacade_Proxy", "getChats");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void postMessage(java.lang.Integer chatId, java.lang.String text, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ChatFacade_Proxy", "postMessage");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.Integer/3438268394");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeObject(chatId);
      streamWriter.writeString(text);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void updateChatMessages(java.lang.Integer[] chats, java.lang.Integer lastMessageId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("ChatFacade_Proxy", "updateChatMessages");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("[Ljava.lang.Integer;/1574882222");
      streamWriter.writeString("java.lang.Integer/3438268394");
      streamWriter.writeObject(chats);
      streamWriter.writeObject(lastMessageId);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
