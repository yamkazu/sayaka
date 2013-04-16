import grails.converters.JSON
import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils
import org.springframework.security.authentication.AccountExpiredException
import org.springframework.security.authentication.CredentialsExpiredException
import org.springframework.security.authentication.DisabledException
import org.springframework.security.authentication.LockedException
import org.springframework.security.core.context.SecurityContextHolder as SCH
import org.springframework.security.web.WebAttributes

import javax.servlet.http.HttpServletResponse

class LoginController {

    /**
     * Dependency injection for the springSecurityService.
     */
    def springSecurityService

    /**
     * Callback after a failed login. Redirects to the auth page with a warning message.
     */
    def fail() {
        String msg = ''
        def exception = session[WebAttributes.AUTHENTICATION_EXCEPTION]
        if (exception) {
            if (exception instanceof AccountExpiredException) {
                msg = g.message(code: "springSecurity.errors.login.expired")
            } else if (exception instanceof CredentialsExpiredException) {
                msg = g.message(code: "springSecurity.errors.login.passwordExpired")
            } else if (exception instanceof DisabledException) {
                msg = g.message(code: "springSecurity.errors.login.disabled")
            } else if (exception instanceof LockedException) {
                msg = g.message(code: "springSecurity.errors.login.locked")
            } else {
                msg = g.message(code: "springSecurity.errors.login.fail")
            }
        }

        response.setStatus 403
        render([error: msg] as JSON)
    }

    /**
     * The Ajax success redirect url.
     */
    def success() {
        render principal as JSON
    }

    def denied() {
        render([error: 'access denied'] as JSON)
    }

    def status() {
        if (springSecurityService.isLoggedIn()) {
            success()
        } else {
            render text: "NotLoggedIn", status: HttpServletResponse.SC_UNAUTHORIZED
        }
    }
}
