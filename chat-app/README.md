This is a common chat runtime used by chat-gxt, chat-smartgwt and chat-angular front end applications. It contains chat domain model, persistence layer using JPA, persistence layer using Hibernate. ChatService. websocket connectivity. GWT-RPC services used by both of GWT based front-ends and REST services used by Angular based fron-end.

```java
public interface ViewFactory {
	ChatView createChatView();
}
````

```java

public interface ChatApplication {
	ChatView getChatView();
	ChatFacadeAsync getChatFacade();
	EventBus getEventBus();
	PlaceController getPlaceController();
	ChatModel getChatModel();
	ViewFactory getViewFactory();
	ChatMessageRenderer getChatMessageRenderer();
	Integer getDefaultChatId();
	void setDefaultChatId(Integer defaultChatId);	
	void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory);
	void setChatMessageRenderer(ChatMessageRenderer chatMessageRederer);
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