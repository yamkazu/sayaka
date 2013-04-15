package sayaka.spring.security

import org.codehaus.groovy.grails.plugins.springsecurity.GrailsUser

class SayakaUser extends GrailsUser {

    final String salt

    SayakaUser(GrailsUser grailsUser, String salt) {
        super(grailsUser.username, grailsUser.password, grailsUser.enabled, grailsUser.accountNonExpired, grailsUser.credentialsNonExpired, grailsUser.accountNonLocked, grailsUser.authorities, grailsUser.id)
        this.salt = salt
    }
}
