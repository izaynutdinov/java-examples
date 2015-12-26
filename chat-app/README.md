# chat-app - common chat runtime

chat-app implements common chat application logic used by:

* chat-gxt - Sencha GXT based chat application
* chat-smartgwt - Smart GWT based chat application
* chat-angular - Angular.JS based chat application

It contains:

* Chat domain model
* Persistence layer using JPA
* Persistence layer using Hibernate
* ChatServiceImpl - chat business logic
* websocket (STOMP) connectivity
* GWT-RPC services used by both of GWT based front-ends
* REST services used by Angular based fron-end
* GWT MVP Application logic


## Compiling

To compile and install chat-app into local maven repository execute the following commands in linux command line inside chat-app directory:

````

$ (cd ../thirdparty/gwt-stomp/; mvn install)
$ mvn install

````

gwt-stomp is a STOMP protocol support for the GWT Framework.


## GWT-MVP

chat-app includes full implementation of Chat-MVP.

The GWT MVP application logic implemented in `ChatApplication`. Two implementations of this interface provided: `PollingChatApplication` and `STOMPChatApplication`. Both use `PollingChatModel` and `STOMPChatModel` as a chat model implementation respectively.


```java

package net.iskandar.examples.chat.app.client.mvp;

public interface ChatApplication {
	ChatFacadeAsync getChatFacade();
	ViewFactory getViewFactory();
	ChatMessageRenderer getChatMessageRenderer();
	Integer getDefaultChatId();
	void setDefaultChatId(Integer defaultChatId);
	void setChatMessageRenderer(ChatMessageRenderer chatMessageRederer);
	void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory);
}

````

`ViewFactory` abstracts process of creation of `ChaView` wich is UI library specific. So both GWT based chat applications (chat-smartgwt and chat-gxt) implements it's own `ViewFactory`.

```java
public interface ViewFactory {
	ChatView createChatView();
}
````

There is also internal Chat application interface used by chat-app internal components such as `net.iskandar.examples.chat.app.client.mvp.activities.ChatActivity`:

```java
package net.iskandar.examples.chat.app.client.mvp;


public interface ChatApplicationInternal extends ChatApplication {
	EventBus getEventBus();
	ChatView getChatView();
	PlaceController getPlaceController();
	ChatModel getChatModel();
}
````




```java
@RemoteServiceRelativePath("facade")
public interface ChatFacade extends RemoteService {
	List<ChatTo> getChats() throws ChatFacadeException;
	List<ChatUserTo> getChatUsers(Integer chatId) throws ChatFacadeException;
	ChatMessagesTo getChatMessages(Integer chatId, int days) throws ChatFacadeException;
	List<ChatMessageTo> updateChatMessages(Integer[] chats, Integer lastMessageId) throws ChatFacadeException;
	void postMessage(Integer chatId, String text) throws ChatFacadeException;
}
````
