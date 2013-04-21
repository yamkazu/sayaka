import sayaka.command.SignupCommand

class SignupController {

    def form() {
        render view: 'signup'
    }

    def signup(SignupCommand command) {

        println params
        println request.JSON
        println command

        render text: "ok!"
    }
}
