class SignupController {

    def form() {
        render view: 'signup'
    }

    def signup() {
        render text: "ok!"
    }
}
