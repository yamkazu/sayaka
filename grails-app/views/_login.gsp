<%@ page import="org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils" %>
<g:set var="config" value="${SpringSecurityUtils.securityConfig}"/>
<div id='login' ng-controller='LoginCtrl'>
    <form ng-hide="userContext.isLoggedIn()" method='POST' id='loginForm' autocomplete='off' ng-submit='login()'>
        <input type='text' name='username' id='username' ng-model='username'/>
        <input type='password' name='password' id='password' data-ng-model="password"/>
        <input type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/>
    </form>
    <div ng-show="userContext.isLoggedIn()">
        {{userContext.username()}}
        <a href="" data-ng-click="logout()">Logout</a>
    </div>
</div>