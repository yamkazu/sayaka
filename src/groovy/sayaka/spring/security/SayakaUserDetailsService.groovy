package sayaka.spring.security

import org.codehaus.groovy.grails.plugins.springsecurity.GormUserDetailsService
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class SayakaUserDetailsService extends GormUserDetailsService {

    @Override
    protected UserDetails createUserDetails(user, Collection<GrantedAuthority> authorities) {
        return new SayakaUser(super.createUserDetails(user, authorities), user.salt)
    }
}
