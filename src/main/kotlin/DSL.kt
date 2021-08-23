fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun Person.address(block: Address.() -> Unit) {
    address = Address().apply(block)
}
