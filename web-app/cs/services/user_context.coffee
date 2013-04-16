app = angular.module "sayaka"

app.factory "userContext", ($http, Url) ->
  loggedIn = false
  userInfo = {}

  context =
    isLoggedIn: ->
      loggedIn
    info: ->
      userInfo
    username: ->
      userInfo.username
    set: (info) ->
      userInfo = info
      loggedIn = true
    clear: ->
      userInfo = {}
      loggedIn = false

  $http.get(Url.create("login/status")).success (data, status, headers, config) ->
    context.set(data)

  return context
