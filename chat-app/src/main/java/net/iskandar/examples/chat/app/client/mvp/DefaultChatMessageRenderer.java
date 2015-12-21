package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.UserTo;

public class DefaultChatMessageRenderer implements ChatMessageRenderer {

	@Override
	public String renderChatMessage(ChatMessageTo message) {
		StringBuffer buf = new StringBuffer();
		String[] lines = message.getText().split("\n");
		for(int i = 0; i < lines.length; i++){
			if(i < (lines.length - 1))
				buf.append(lines[i] + "<br/>");
			else
				buf.append(lines[i]);
		}
		UserTo user = message.getChatUser().getUser();
		StringBuffer messageHtml = new StringBuffer("<div class=\"chat-message\"><b>");
		messageHtml.append(message.getTime().toString());
		messageHtml.append(" ");
		messageHtml.append(user.getFirstName());
		messageHtml.append("&nbsp;");
		messageHtml.append(user.getLastName());
		messageHtml.append(" wrote:  </b>");
		messageHtml.append(buf.toString());
		messageHtml.append("</div>");
		return messageHtml.toString();
	}

}
