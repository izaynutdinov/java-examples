# chat-gxt - GWT/Sencha GXT/chat-app runtime based chat application

## Compiling

````
$ (cd ../thirdparty/gwt-stomp; mvn clean install)
$ (cd ../chat-app; mvn clean install)
$ mvn clean install
````

## Running
### Running chat-gxt using maven jetty plugin

To run chat-gxt using maven jetty plug in execute:
````
$ mvn jetty:run-war

````
Then open http://localhost:8080/index.mvc in Web Browser.


### Running using tomcat 8

To run chat-gxt using Tomcat 8 first install Tomcat 8. Then set `CATALINA_HOME` environment variable so that it points to your Tomcat 8 installation. Then execute this commands in linux command line:

````
$ cp target/chat-gxt-1.0.war $CATALINA_HOME/webapps/chat-gxt.war
$ $CATALINA_HOME/bin/catalina.sh run
````

For windows users commands will little different.
