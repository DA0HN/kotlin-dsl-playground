fun main(args: Array<String>) {
    val person = person {
        name = "Gabriel"
        age = 25
        address {
            street = "Street 1"
            number = 33
            city = "VG City"
        }
    }

    println(person)
}
