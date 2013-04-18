class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?" {
            constraints {
                // apply constraints here
            }
        }

        "/signup" view: "/signup"
        "/"       view: "/index"

        "500"     view: "/error"
    }
}
