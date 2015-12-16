package com.codeveo.gwt.stomp.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.JavaScriptObject;

public class StompClient {
    private static final Logger logger = Logger.getLogger(StompClient.class.getName());
    private final boolean useSockJs;
    private String wsURL;
    private Callback callback;
    private JavaScriptObject jsoStompClient;
    private boolean isConnected = false;
    private Map<String, Subscription> subscriptions;
    private boolean enableDebug;

    public static interface Callback {
        void onConnect();

        void onError(String cause);

        void onDisconnect();
    }

    public StompClient(String wsURL, Callback callback, boolean useSockJs, boolean enableDebug) {
        this.useSockJs = useSockJs;
        this.wsURL = wsURL;
        this.callback = callback;
        this.subscriptions = new HashMap<String, Subscription>();
        this.enableDebug = enableDebug;
    }

    public final void connect() {
        if (isConnected) {
            logger.log(Level.FINE, "Already connected");
            return;
        }

        logger.log(Level.FINE, "Connecting to '" + wsURL + "' ...");
        __connect(wsURL, useSockJs, enableDebug);
    }

    public final void disconnect() {
        for (Entry<String, Subscription> id : subscriptions.entrySet()) {
            unsubscribe(id.getKey());
        }

        logger.log(Level.FINE, "Disconecting from '" + wsURL + "' ...");
        __disconnect();
    }

    public final Subscription subscribe(String destination, MessageListener listener) {
        logger.log(Level.FINE, "Subscribing to destination '" + destination + "' ...");
        Subscription subscription = __subscribe(destination, listener);

        logger.log(Level.FINE, "Subscribed to destination '" + destination + "' with ID '" + subscription.getId() + "'");
        subscriptions.put(destination, subscription);

        return subscription;
    }

    public final void unsubscribe(String destination) {
        Subscription subscription = subscriptions.get(destination);

        if (subscription != null) {
            logger.log(Level.FINE, "Unsubscribing from destination '" + destination + "' ...");
            __unsubscribe(subscription);

            logger.log(Level.FINE, "Unsubscribed from destination '" + destination + "'");
            subscriptions.remove(destination);
        }
    }

    public native final void send(String destination, String jsonString)
    /*-{
        var self = this;
        self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient.send(destination, {}, jsonString);
    }-*/;

    private native final void __connect(String wsURL, boolean overSockJs, boolean enableDebug)
    /*-{
        var self = this;

    	var onConnected = function () {
            self.@com.codeveo.gwt.stomp.client.StompClient::onConnected()();
        };

        // TODO: Not used. Could not add to connect() because stomp.connect() is looking
        //       for Function object while parsing arguments.
    	var onError = function (cause) {
    		self.@com.codeveo.gwt.stomp.client.StompClient::onError(Ljava/lang/String;)(cause);
    	};

        if (overSockJs === true) {
            var socket = new $wnd.SockJS(wsURL);

            self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient = $wnd.Stomp.over(socket);
        } else {
            self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient = $wnd.Stomp.client(wsURL);
        }

        if (self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient != null && !enableDebug) {
            self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient.debug = null;
        }

        self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient.connect({}, onConnected);
    }-*/;

    private native final void __disconnect()
    /*-{
    	var self = this;

    	var ondisconnect = function(){
    		self.@com.codeveo.gwt.stomp.client.StompClient::onDisconnect()();
    	};

    	self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient.disconnect(ondisconnect);
    }-*/;

    private native final Subscription __subscribe(String destination, MessageListener listener)
    /*-{
        var self = this;

    	var onMessage = function (message) {
    		listener.@com.codeveo.gwt.stomp.client.MessageListener::onMessage(Lcom/codeveo/gwt/stomp/client/Message;)(message);
    	};

    	var subscription = self.@com.codeveo.gwt.stomp.client.StompClient::jsoStompClient.subscribe(destination, onMessage);

     	return subscription;
    }-*/;

    private native final void __unsubscribe(Subscription subscription)
    /*-{
        subscription.unsubscribe();
    }-*/;

    /* Need to wrap the callbacks */
    private void onConnected() {
        if (callback != null && !isConnected) {
            isConnected = true;
            callback.onConnect();
        }
    }

    private void onDisconnect() {
        if (callback != null) {
            callback.onDisconnect();
            isConnected = false;
        }
    }

    private void onError(String cause) {
        if (callback != null) {
            callback.onError(cause);
        }
    }

}
