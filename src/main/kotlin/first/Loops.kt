


fun main() {


    val items = listOf("apple", "orange", "banana"); // List.of() Java , неизменяемый

    val items2 = mutableListOf("1", "2", "3")  // arrayList


    for(item in items2) {
        println(item)
    }


    // while
    var index = 0

    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }



    // Диапазоны (как в Python)
    println(5 in 3..10) // true


    for (i in 1..5) {   // диапазон [1 - 5]
        println(i)
    }

    for (i in 1 until 5) {   // диапазон [1 - 5)
        println(i)
    }

    for(i in 5 downTo 1) {  // в убывающем порядке
        println(i)
    }

    for(i in 0..100 step 10) {  // в убывающем порядке
        println(i)
    }


}