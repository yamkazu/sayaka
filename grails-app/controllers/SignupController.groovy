import sayaka.command.SignupCommand

class SignupController {

    def form() {
        render view: 'signup'
    }

    def signup(SignupCommand command) {
        command.singup()

        render text: "ok!"
    }
}
