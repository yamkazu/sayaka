modules = {
    sayaka {
        dependsOn "angular"

        resource url: 'cs/sayaka.coffee'

        resource url: 'cs/services/url.coffee'
        resource url: 'cs/services/user_context.coffee'

        resource url: 'cs/controllers/login.coffee'
        resource url: 'cs/controllers/signup.coffee'

        resource url: 'cs/router.coffee'
    }
}