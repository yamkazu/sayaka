
app = angular.module "sayaka"

app.controller "LoginCtrl", ($scope, $http, userContext, Url) ->

  $scope.login = ->
    $http({
      method: 'POST',
      url: Url.create("login"),
      data: $.param({ username: $scope.username, password: $scope.password }),
      headers: { 'Content-Type': 'application/x-www-form-urlencoded' }
    }).success (data, status, headers, config) ->
      userContext.set(data)

    $scope.password = ""

  $scope.logout = ->
    $http.get(Url.create("logout")).success (data, status, headers, config) ->
      userContext.clear()

  $scope.userContext = userContext
