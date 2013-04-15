package sayaka.spring.security

import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder

class SayakaDigestPasswordEncoder extends MessageDigestPasswordEncoder {
    SayakaDigestPasswordEncoder() {
        super("SHA-512")
        iterations = 100
    }
}
