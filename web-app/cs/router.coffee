app = angular.module "sayaka"

app.config ['$routeProvider', ($routeProvider, Url) ->
  $routeProvider.when('/signup', {templateUrl: '/sayaka/signup'})
]
#  $routeProvider.when('/signup', {templateUrl: Url.createUrl.create('/sayaka/signup')})
#  $routeProvider.when('/phones', {templateUrl: 'partials/phone-list.html',   controller: PhoneListCtrl})
