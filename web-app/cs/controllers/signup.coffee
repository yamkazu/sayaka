app = angular.module "sayaka"

app.controller "SignupCtrl", ($scope, $http, Url) ->

  $scope.signup = ->
    $http.post(Url.create("signup"), $scope.user) .success ->
      alert('success')
