<%@ page import="org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils" %>
<g:set var="config" value="${SpringSecurityUtils.securityConfig}"/>
<div id='login' ng-controller='LoginCtrl' login-url='${request.contextPath}${config.apf.filterProcessesUrl}'>
    <form method='POST' id='loginForm' autocomplete='off' ng-submit='submit()'>
        <input type='text' name='j_username' id='username' ng-model='j_username'/>
        <input type='password' name='j_password' id='password' data-ng-model="j_password"/>
        <input type='submit' id="submit" value='${message(code: "springSecurity.login.button")}'/>
    </form>
</div>