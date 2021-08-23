fun person(block: Person.() -> Unit): Person {
    val p = Person()
    block(p)
    return p
}
