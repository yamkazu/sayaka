app = angular.module "sayaka"

app.config ['$routeProvider', ($routeProvider) ->
  $routeProvider.when('/signup', {templateUrl: '/sayaka/signup'})
]
