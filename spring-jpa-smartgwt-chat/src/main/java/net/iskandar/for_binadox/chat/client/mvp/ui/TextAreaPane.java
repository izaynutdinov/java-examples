package net.iskandar.for_binadox.chat.client.mvp.ui;

import com.google.gwt.core.client.JavaScriptObject;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.TextAreaItem;
import com.smartgwt.client.widgets.layout.Layout;

public class TextAreaPane extends DynamicForm {

	private TextAreaItem messageItem;
	
	public TextAreaPane() {
		super();
		messageItem = new TextAreaItem();  
        messageItem.setShowTitle(false);  
        messageItem.setColSpan(2);  
        messageItem.setWidth("*");  
        messageItem.setHeight("*");
        setFields(messageItem);
	}

	public void setText(String text){
		messageItem.setValue(text);
	}
	
	
	public String getText(){
		return messageItem.getValue().toString();
	}
	
	
	
}
