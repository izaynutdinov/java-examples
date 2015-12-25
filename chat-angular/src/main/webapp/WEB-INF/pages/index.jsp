<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!doctype html>

<html>

<head>

<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<link type="text/css" rel="stylesheet" href="style/chat.css">

<script type="text/javascript" src="scripts/angular.js"></script>
<script type="text/javascript" src="scripts/angular-route.js"></script>

<script src="bower_components/sockjs/sockjs.min.js"></script>
<script src="bower_components/stomp-websocket/lib/stomp.min.js"></script>
<script src="bower_components/ng-stomp/ng-stomp.min.js"></script>
<script src="bower_components/angular-scroll-glue/src/scrollglue.js"></script>
<script type="text/javascript" src="scripts/chat.js"></script>


<title>Angular JS Chat</title>

</head>

<body ng-app="app">

	<noscript>
		<div class="no-javascript">Your web browser must have JavaScript
			enabled in order for this application to display correctly.</div>
	</noscript>

	<div id="full-size" ng-controller="MainController">

		<div class="header">
			<div style="float: left; padding: 10px;">Chat Application Using Angular.JS</div>
			<div style="float: right; padding: 10px; font-size: 10pt;"><a class="menu-item" href="login.mvc">Sign Out</a></div>
			<div style="clear: both;"></div>			
		</div>

		<div id="menu">
			<ul class="menu">
				<li ng-repeat="chat in chats" class="menu">
					<a href="" ng-click="setCurrentChat(chat)">{{ chat.title }}</a>
				</li>
			</ul>
		</div>

		<div class="chat-body">
			<div ng-view>
			
			</div>
		</div>

		<div style="clear:both;"></div>

		<div class="footer">
			<div style="padding: 10px; width: 100%; text-align:center;">Copyright &copy; Iskandar Zaynutdinov 2015</div>
		</div>

	</div>

</body>
</html>
