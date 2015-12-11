package com.codeveo.gwt.stomp.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Message extends JavaScriptObject {
    protected Message() {
    }

    public final native Header getHeaders()
    /*-{
        return this.headers;
    }-*/;

    public native final String getBody()
    /*-{
        return this.body;
    }-*/;
}
