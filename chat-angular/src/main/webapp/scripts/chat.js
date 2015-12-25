
function MainController($scope, $http, $sce, $location){
	$http.get('rest/chats', {}).success(function(chats){
		$scope.chats = chats.data;
	});
	
	$scope.setCurrentChat = function(chat){
		$scope.currentChat = chat;
		$location.path("/chat/" + chat.id);		
	}
}

function ChatController($scope, $http, $sce, $routeParams, $stomp){

	$scope.messageText = '';
	console.log("ChatController");

	$http.get('rest/chats/' + $routeParams.id + '?days=0', { days: 12 }).success(function(chatMessages){
		$scope.chatMessages = chatMessages.data;
	});

	$scope.renderHtml = function(html_code){
	    return $sce.trustAsHtml(html_code);
	};

	console.log("window.location.host=" + window.location.host);
	console.log("window.location.pathname=" + window.location.pathname.split('/'));
	console.log("window.location.protocol=" + window.location.protocol);
	var url = window.location.protocol + "//" + window.location.host + '/';
	var path = window.location.pathname.split('/');
	for (var i = 1; i < path.length-1; i++) {
		url += path[i];
		url += '/';
	}
	url += 'app/stomp';
	console.log("url=" + url);
	$scope.conn = $stomp.connect(url, {});

    $scope.conn.then(function(frame){
    	console.log("STOMP Connected!");
        $scope.subscription = $stomp.subscribe('/chats/' + $routeParams.id, function (payload, headers, res){
            $scope.payload = payload;
            console.log(payload);
            console.log($scope.chatMessages);
            $scope.chatMessages.messages.push(payload);
            $scope.$apply();
        },{});
    });

	$scope.$on("$destroy", function() {
		console.log("on destroy");
		$stomp.disconnect();
    });

	$scope.sendMessage = function(){
		console.log("sendMessage");
		$http.post('rest/chats/' + $routeParams.id, {text: $scope.messageText});
		$scope.messageText = "";
	};

}

var app = angular.module('app', [ 'ngRoute', 'ngStomp', 'luegg.directives' ]);
app.controller('MainController', MainController);
app.controller('ChatController', ChatController);
app.controller('WelcomeController', function($scope){});

app.config(function($routeProvider){
	console.log("app.config");
	$routeProvider.when('/', { 
		controller: 'WelcomeController',
		templateUrl: 'partials/welcome.html'});
	$routeProvider.when('/chat/:id', { 
		controller: 'ChatController',
		templateUrl: 'partials/chat-body.html'});
	$routeProvider.otherwise({
		redirectTo: '/'
	});
});
