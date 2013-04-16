app = angular.module "sayaka"

app.factory "Url", ->
  baseUrl = angular.element('body').data('base-url')
  create: (path) ->
    baseUrl + path