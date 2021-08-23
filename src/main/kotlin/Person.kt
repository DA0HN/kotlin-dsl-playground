import java.time.LocalDate

/**
 * @author daohn
 * @since 23/08/2021
 */
data class Person(
    val name: String,
    val dob: LocalDate,
    val addresses: List<Address>
)
