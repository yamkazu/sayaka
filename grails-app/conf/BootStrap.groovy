class BootStrap {

    def fixtureLoader

    def init = { servletContext ->

        fixtureLoader.load("system/*")
        environments {
            development {
                fixtureLoader.load("development/*")
            }
        }

    }

    def destroy = {
    }
}
