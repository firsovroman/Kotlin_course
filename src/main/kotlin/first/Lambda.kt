

fun main() {

    val a = listOf(1,2,3,4,5)

    a.forEach { e -> println(e) }

    println(a.map { e -> e*2 })

    println(a.filter { e -> e % 2 == 0 })

    println(a.reduce {sum, e -> sum + e})


    a.sortedByDescending { it }




    val numbers = listOf(1,-2,3,-4,5)

    val (positive, negative) = numbers.partition { it > 0 }


    println(positive)
    println(negative)

    val result = listOf("a", "bb", "ccc", "dddd").groupBy { it.length }

    println(result) // HashMap или LinkedHashMap
    

}





