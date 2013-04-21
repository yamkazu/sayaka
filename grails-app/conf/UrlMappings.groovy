class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?" {
            constraints {
                // apply constraints here
            }
        }

        "/signup"(controller: "signup") {
            action = [GET: "form", POST: "signup"]
        }

        "/" view: "/index"

        "500" view: "/error"
    }
}
