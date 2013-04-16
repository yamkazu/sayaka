<!DOCTYPE html>
<html>
<head>
    <r:require modules="sayaka"/>
    <r:layoutResources/>
</head>

<body ng-app="sayaka" data-base-url="${createLink(uri: '/')}">

<g:render template="/login"/>

</body>
<r:layoutResources/>
</html>