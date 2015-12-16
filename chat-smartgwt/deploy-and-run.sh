#!/bin/sh

echo "==================================== Build and Deploy ====================================================="

rm -rf $CATALINA_HOME/webapps/chat-smartgwt
cp target/chat-smartgwt-1.0.war $CATALINA_HOME/webapps/chat-smartgwt.war
$CATALINA_HOME/bin/catalina.sh jpda run

