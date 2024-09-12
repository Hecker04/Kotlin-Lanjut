fun printALL(String: Collection<String>) {
    for (s in String) print("$s")
    println()
}
fun main(args: Array<String>) {
    val stringList = listOf("one","two","one")
    printALL(stringList)

    val stringset = setOf("one","two","three")
    printALL(stringset)
}
