package com.codeveo.gwt.stomp.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Header extends JavaScriptObject {
	protected Header() {
	}

	public final native String getDestination()
	/*-{
		return this.destination;
	}-*/;

	public final native String getSubscription()
	/*-{
		return this.subscription;
	}-*/;

	public final native String getId()
	/*-{
		return this["message-id"];
	}-*/;

	public final native Integer getContentLength()
	/*-{
		return this["content-length"];
	}-*/;

}
