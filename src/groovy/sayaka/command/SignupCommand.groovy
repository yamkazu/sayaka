package sayaka.command

import grails.validation.Validateable
import sayaka.User


@Validateable
class SignupCommand {

    String username
    String password

    def singup() {
        def user = new User()
        
        println username
        println password
        
        user.username = username
        user.password = password
        
        user.save(flush: true, failOnError: true)
    }
}
