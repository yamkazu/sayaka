package sayaka

class JSONParamMapFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                request.JSON.each { k,v ->
                    params."$k" = v
                }
            }
        }
    }
}
