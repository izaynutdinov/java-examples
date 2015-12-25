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

To compile and install chat-app into local maven repository execute the following commands in linux command line:

````

$ (cd ../thirdparty/gwt-stomp/; mvn install)
$ mvn install

````

gwt-stomp is a STOMP protocol support for the GWT Framework.


## GWT-MVP


The GWT MVP application logic implemented in `ChatApplication`. Two implementations of this interface provided: `PollingChatApplication` and `STOMPChatApplication`.


```java
public interface ChatApplication {
	ChatView getChatView();
	ChatFacadeAsync getChatFacade();
	EventBus getEventBus();
	PlaceController getPlaceController();
	ChatModel getChatModel();
	ViewFactory getViewFactory();
	void setChatMessageRenderer(ChatMessageRenderer chatMessageRederer);
	ChatMessageRenderer getChatMessageRenderer();
	Integer getDefaultChatId();
	void setDefaultChatId(Integer defaultChatId);
	void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory);
}
````

`ViewFactory` abstracts process of creation of `ChaView` wich is UI library specific.

```java
public interface ViewFactory {
	ChatView createChatView();
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
