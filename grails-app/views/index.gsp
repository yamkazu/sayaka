<!DOCTYPE html>
<html>
<head>
    <r:require modules="sayaka"/>
    <r:layoutResources/>
</head>

<body ng-app="sayaka" data-base-url="${createLink(uri: '/')}">

<g:render template="/login"/>

<a href="#/signup">singup</a>
<div ng-view></div>

</body>
<r:layoutResources/>
</html>