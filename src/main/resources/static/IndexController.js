var mainApp = angular.module("mainApp", [
    "ngRoute"
]);

var loadController = function (dependancies) {
    console.log(dependancies)
    return {
        loadController: ['$q', '$rootScope', function ($q, $rootScope) {
            var defer = $q.defer();
            require(dependancies, function () {
                defer.resolve();
                $rootScope.$apply();
            });
            return defer.promise;
        }]
    };
};

mainApp.config(['$routeProvider','$controllerProvider','$compileProvider', function($routeProvider,$controllerProvider,$compileProvider){
    mainApp.register = {
        controller:$controllerProvider.register
    };

    $routeProvider
    .when('/',{template:'这是首页'})
    .when('/user',{
        templateUrl: 'pages/userManage.html',
        controller: 'UserController',
        resolve: loadController(['controller/UserController'])
    })
    .otherwise({redirectTo:'/'});
}]);

mainApp.controller('IndexController', ['$scope', '$rootScope',"$location", function($scope, $rootScope,$location) {


}]);