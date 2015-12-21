#!/bin/sh

echo "==================================== Build and Deploy ====================================================="

rm -rf $CATALINA_HOME/webapps/chat-gxt
cp target/chat-gxt-1.0.war $CATALINA_HOME/webapps/chat-gxt.war
$CATALINA_HOME/bin/catalina.sh jpda run

