import sayaka.spring.security.SayakaDigestPasswordEncoder
import sayaka.spring.security.SayakaUserDetailsService

// Place your Spring DSL code here
beans = {

    passwordEncoder(SayakaDigestPasswordEncoder)
    userDetailsService(SayakaUserDetailsService) {
        grailsApplication = ref('grailsApplication')
    }
}
