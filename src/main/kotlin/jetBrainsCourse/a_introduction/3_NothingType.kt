package jetBrainsCourse

import java.lang.IllegalArgumentException


// если убрать тип возвращаемого значения :Nothing то компилятор не даст запустить программу, задав же этот тип
// мы показываем ему что в таком случае выполнение программы не продолжится в случае age==null
fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) {
        failWithWrongAge(age)
    }
    println("Congrats! Next year you'll be ${age + 1}.")
}

fun main() {
    checkAge(10)
}