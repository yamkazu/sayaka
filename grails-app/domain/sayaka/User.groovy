package sayaka

import org.apache.commons.lang.RandomStringUtils

class User {

    transient springSecurityService

    String username
    String password

    String salt

    boolean enabled
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    static constraints = {
        username blank: false, unique: true
        password blank: false
        salt nullable: true
    }

    static mapping = {
        password column: '`password`'
    }

    def beforeInsert() {
        generateSalt()
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    private generateSalt() {
        salt = RandomStringUtils.randomAlphanumeric(32)
    }

    private encodePassword() {
        password = springSecurityService.encodePassword(password, salt)
    }
}
