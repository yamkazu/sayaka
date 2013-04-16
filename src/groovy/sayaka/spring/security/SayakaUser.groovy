package sayaka.spring.security

import grails.converters.JSON
import org.codehaus.groovy.grails.plugins.springsecurity.GrailsUser

class SayakaUser extends GrailsUser {

    static {
        JSON.registerObjectMarshaller(SayakaUser) { SayakaUser user ->
            return [
                username: user.username
            ]
        }
    }

    final String salt

    SayakaUser(GrailsUser grailsUser, String salt) {
        super(grailsUser.username, grailsUser.password, grailsUser.enabled, grailsUser.accountNonExpired, grailsUser.credentialsNonExpired, grailsUser.accountNonLocked, grailsUser.authorities, grailsUser.id)
        this.salt = salt
    }
}
