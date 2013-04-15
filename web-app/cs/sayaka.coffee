app = angular.module "sayaka", []

app.controller "LoginCtrl", ($scope, $http) ->
  $scope.submit = ->
    $http({
      method: 'POST',
      url: $scope.loginUrl,
      data: $.param({ j_username: $scope.j_username, j_password: $scope.j_password }),
      headers: { 'Content-Type': 'application/x-www-form-urlencoded' }
    }).success (data, status, headers, config) ->
      alert "success"

app.directive "loginUrl", ->
  (scope, element, attr) ->
    scope.loginUrl = attr['loginUrl']
