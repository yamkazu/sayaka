package sayaka

class Role {

    String authority

    static constraints = {
        authority blank: false, unique: true
    }
}
