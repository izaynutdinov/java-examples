package net.iskandar.examples.chat.app.client.log;

public class Logger{

	private String name;

	public Logger(String name){
		super();
		this.name = name;
	}

	public void log(String message){
		consoleLog(name, message);
	}

	private native void consoleLog(String name, String message) /*-{
    	console.log( name + ":" + message );
	}-*/;

}
