This is a common chat runtime used by chat-gxt and chat-smartgwt

```java
package net.iskandar.examples.chat.app.client.mvp.views;

import net.iskandar.examples.chat.app.client.mvp.ChatApplication;

public interface ViewFactory {
	ChatView createChatView();
}
````