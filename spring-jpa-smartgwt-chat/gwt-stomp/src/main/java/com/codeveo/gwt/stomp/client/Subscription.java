package com.codeveo.gwt.stomp.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Subscription extends JavaScriptObject {
    protected Subscription() {
    }

    public final native String getId()
    /*-{
        return this.id;
    }-*/;

    public final native JavaScriptObject getUnsubscribe()
    /*-{
        return this.unsubscribe;
    }-*/;
}
