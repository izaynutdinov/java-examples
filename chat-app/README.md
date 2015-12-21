This is a common chat runtime used by chat-gxt and chat-smartgwt

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