package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.to.ChatMessageTo;

public interface ChatMessageRenderer {
	String renderChatMessage(ChatMessageTo chatMessage);
}
