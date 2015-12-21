package net.iskandar.examples.chat.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class ChatFacade_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["[Ljava.lang.Integer;/1574882222"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/Integer;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
      ];
    
    result["net.iskandar.examples.chat.app.client.ChatFacadeException/994922254"] = [
        @net.iskandar.examples.chat.app.client.ChatFacadeException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.ChatFacadeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/iskandar/examples/chat/app/client/ChatFacadeException;),
      ];
    
    result["net.iskandar.examples.chat.app.client.ChatFacadeException$ErrorCode/946018630"] = [
        @net.iskandar.examples.chat.app.client.ChatFacadeException_ErrorCode_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.ChatFacadeException_ErrorCode_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/iskandar/examples/chat/app/client/ChatFacadeException$ErrorCode;),
      ];
    
    result["net.iskandar.examples.chat.app.client.to.ChatMessageTo/2611184133"] = [
        @net.iskandar.examples.chat.app.client.to.ChatMessageTo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.ChatMessageTo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/iskandar/examples/chat/app/client/to/ChatMessageTo;),
      ];
    
    result["[Lnet.iskandar.examples.chat.app.client.to.ChatMessageTo;/4097118722"] = [
        @net.iskandar.examples.chat.app.client.to.ChatMessageTo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.ChatMessageTo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/iskandar/examples/chat/app/client/to/ChatMessageTo;),
      ];
    
    result["net.iskandar.examples.chat.app.client.to.ChatMessagesTo/223091811"] = [
        @net.iskandar.examples.chat.app.client.to.ChatMessagesTo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.ChatMessagesTo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/iskandar/examples/chat/app/client/to/ChatMessagesTo;),
      ];
    
    result["net.iskandar.examples.chat.app.client.to.ChatTo/580014730"] = [
        @net.iskandar.examples.chat.app.client.to.ChatTo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.ChatTo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/iskandar/examples/chat/app/client/to/ChatTo;),
      ];
    
    result["[Lnet.iskandar.examples.chat.app.client.to.ChatTo;/3169947995"] = [
        @net.iskandar.examples.chat.app.client.to.ChatTo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.ChatTo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/iskandar/examples/chat/app/client/to/ChatTo;),
      ];
    
    result["net.iskandar.examples.chat.app.client.to.ChatUserTo/2610239105"] = [
        @net.iskandar.examples.chat.app.client.to.ChatUserTo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.ChatUserTo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/iskandar/examples/chat/app/client/to/ChatUserTo;),
      ];
    
    result["[Lnet.iskandar.examples.chat.app.client.to.ChatUserTo;/692018729"] = [
        @net.iskandar.examples.chat.app.client.to.ChatUserTo_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.ChatUserTo_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lnet/iskandar/examples/chat/app/client/to/ChatUserTo;),
      ];
    
    result["net.iskandar.examples.chat.app.client.to.UserTo/2220388672"] = [
        @net.iskandar.examples.chat.app.client.to.UserTo_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @net.iskandar.examples.chat.app.client.to.UserTo_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lnet/iskandar/examples/chat/app/client/to/UserTo;),
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer[]::class)] = "[Ljava.lang.Integer;/1574882222";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.ChatFacadeException::class)] = "net.iskandar.examples.chat.app.client.ChatFacadeException/994922254";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode::class)] = "net.iskandar.examples.chat.app.client.ChatFacadeException$ErrorCode/946018630";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.ChatMessageTo::class)] = "net.iskandar.examples.chat.app.client.to.ChatMessageTo/2611184133";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.ChatMessageTo[]::class)] = "[Lnet.iskandar.examples.chat.app.client.to.ChatMessageTo;/4097118722";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.ChatMessagesTo::class)] = "net.iskandar.examples.chat.app.client.to.ChatMessagesTo/223091811";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.ChatTo::class)] = "net.iskandar.examples.chat.app.client.to.ChatTo/580014730";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.ChatTo[]::class)] = "[Lnet.iskandar.examples.chat.app.client.to.ChatTo;/3169947995";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.ChatUserTo::class)] = "net.iskandar.examples.chat.app.client.to.ChatUserTo/2610239105";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.ChatUserTo[]::class)] = "[Lnet.iskandar.examples.chat.app.client.to.ChatUserTo;/692018729";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@net.iskandar.examples.chat.app.client.to.UserTo::class)] = "net.iskandar.examples.chat.app.client.to.UserTo/2220388672";
    return result;
  }-*/;
  
  public ChatFacade_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
