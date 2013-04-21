package sayaka.command

import grails.validation.Validateable
import groovy.transform.ToString
import sayaka.User


@Validateable
@ToString
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

    static constraints = {

    }
}
