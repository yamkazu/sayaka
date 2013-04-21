<div ng-controller='SignupCtrl'>
<form method='post' ng-submit='signup()'>
    <p>username: <g:textField name="username" ng-model="user.username"/></p>
    <p>password: <g:passwordField name="password" ng-model="user.password"/></p>
    <g:submitButton name="signup" value="xxx"/>
    {{user|json}}
</form>
</div>
