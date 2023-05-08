package jetBrainsCourse


const val question = "life, the universe, and everything"
const val answer = 42


// Triple-quoted strings
val tripleQuotedString =
    """
    #question = "$question"
    #answer = $answer
    """.trimMargin("#")


fun main() {

}





val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern(): String = """\d{2} $month \d{4}"""







    fun joinOptions(options: Collection<String>) {
        options.joinToString( prefix = "[", postfix = "]")
    }






// Default arguments

    fun foo(name: String, number: Int=42, toUpperCase: Boolean=false) =
        (if (toUpperCase) name.uppercase() else name) + number

    fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
    )

//public String foo(String name, int number, boolean toUpperCase) {
//    return (toUpperCase ? name.toUpperCase() : name) + number;
//}
//public String foo(String name, int number) {
//    return foo(name, number, false);
//}
//public String foo(String name, boolean toUpperCase) {
//    return foo(name, 42, toUpperCase);
//}
//public String foo(String name) {
//    return foo(name, 42);
//}