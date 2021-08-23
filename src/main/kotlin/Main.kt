fun main(args: Array<String>) {
    val person = person {
        name = "Gabriel"
        dateOfBirth = "23/08/2021"
        addresses {
            address {
                street = "Street 1"
                number = 1
                city = "VG City"
            }
            address {
                street = "Street 2"
                number = 2
                city = "VG City"
            }
            address {
                street = "Street 3"
                number = 3
                city = "VG City"
            }
        }
    }

    println(person)
}
