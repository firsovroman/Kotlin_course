

fun main() {
//    println(testSimple()) // 10
//    println(simpleSum(2,2)) // 10
//    println(testString(2))
//
//
//    testNamedArguments(y = 4, z = 2, x = 5)

//    testDefaultArguments()
//
//    testDefaultArguments(x = 5)
//    testDefaultArguments(y = 5)
//
//    testDefaultArguments(x = 5, y = 5)

    var list = intArrayOf(1, 2, 3, 4, 5)

    printEven(*list,7,8,9)

//    printEven(3,5,6,7,8,12,12,23,34,54)


}


//fun testSimple(): Int {
//    return 5 + 5
//}
fun testSimple(): Int = 5 + 5  // в сокращенном виде


fun simpleSum(x: Int, y: Int) = x + y  // в сокращенном виде не пишем возвращаемое значение


fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z);
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}


//vararg
fun printEven(vararg numbers: Int) {
    numbers.forEach { e ->
        if(e%2 == 0) {
            println(e)
        }
    }

}

