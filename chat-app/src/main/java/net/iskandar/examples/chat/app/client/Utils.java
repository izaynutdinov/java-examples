package net.iskandar.examples.chat.app.client;

import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.ChatUserTo;
import net.iskandar.examples.chat.app.client.to.UserTo;

import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.json.client.JSONString;

public class Utils {

	public static ChatMessageTo parseChatMessageTo(String json){
		JSONValue jsonValue = JSONParser.parseStrict(json);
		ChatMessageTo result = null;
		if(jsonValue instanceof JSONObject){
			result = new ChatMessageTo();
			JSONObject jsonObject = (JSONObject) jsonValue;
			result.setId((int) ((JSONNumber) jsonObject.get("id")).doubleValue());
			result.setTime(((JSONString) jsonObject.get("time")).stringValue());
			result.setText(((JSONString) jsonObject.get("text")).stringValue());
			result.setChatUser(createChatUser(jsonObject.get("chatUser")));
		}
		return result;
	}
	
	public static ChatUserTo createChatUser(JSONValue json){
		ChatUserTo result = null;
		if (json instanceof JSONObject){
			result = new ChatUserTo();
			JSONObject jsonObject = (JSONObject) json;
			result.setChatId((int) ((JSONNumber) jsonObject.get("chatId")).doubleValue());
			result.setId((int) ((JSONNumber) jsonObject.get("id")).doubleValue());
			result.setUser(createUser(jsonObject.get("user")));
		}
		return result;
	}
	
	public static UserTo createUser(JSONValue json){
		UserTo result = null;
		if(json instanceof JSONObject){
			JSONObject jsonObject = (JSONObject) json;
			result = new UserTo();
			result.setId((int) ((JSONNumber) jsonObject.get("id")).doubleValue());
			result.setFirstName(((JSONString) jsonObject.get("firstName")).stringValue());
			result.setLastName(((JSONString) jsonObject.get("lastName")).stringValue());
			result.setLogin(((JSONString) jsonObject.get("login")).stringValue());
		}
		return result;
	}

}
