#!/bin/sh

echo "==================================== Build and Deploy ====================================================="

rm -rf $CATALINA_HOME/webapps/chat-angular
cp target/chat-angular-1.0.war $CATALINA_HOME/webapps/chat-angular.war
$CATALINA_HOME/bin/catalina.sh jpda run

