import java.time.LocalDate
import java.time.format.DateTimeFormatter

@DslMarker
annotation class PersonDsl

fun person(block: PersonBuilder.() -> Unit): Person = PersonBuilder().apply(block).build()

@PersonDsl
class PersonBuilder {

    var name: String = ""
    private var dob: LocalDate = LocalDate.now()
    var dateOfBirth: String = ""
        set(value) {
            val pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            dob = LocalDate.parse(value, pattern)
        }
    private val addresses = mutableListOf<Address>()

    fun addresses(block: ADDRESSES.() -> Unit) = addresses.addAll(ADDRESSES().apply(block))

    fun build(): Person = Person(name, dob, addresses)
}

@PersonDsl
class ADDRESSES : ArrayList<Address>() {
    fun address(block: AddressBuilder.() -> Unit) {
        add(AddressBuilder().apply(block).build())
    }
}

@PersonDsl
class AddressBuilder {
    var street: String = ""
    var number: Int = 0
    var city: String = ""

    fun build(): Address = Address(street, number, city)
}
