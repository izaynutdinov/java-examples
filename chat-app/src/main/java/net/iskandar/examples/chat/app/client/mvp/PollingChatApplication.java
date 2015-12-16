package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.model.PollingChatModelImpl;

public class PollingChatApplication extends ChatApplicationBaseImpl {

	@Override
	protected ChatModel createChatModel() {
		return new PollingChatModelImpl(this);
	}

}
