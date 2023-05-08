package jetBrainsCourse.b_classes


/*
    Например, вы можете написать новые функции для класса из сторонней библиотеки, которую вы не можете изменить.
    Такие функции можно вызывать обычным способом, как если бы они были методами исходного класса.
    Этот механизм называется функцией расширения.
    Существуют также свойства расширения, которые позволяют определять новые свойства для существующих классов.
 */

// здесь мы добавляем методы к двум классам Int() и Pair()

fun Int.r(): RationalNumber = RationalNumber(this, 1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)

fun main(){

    var number: Int = 5
    val result: RationalNumber = number.r()
    println(result)
}




// класс есть в стандартной библиотеке
//data class Pair<out A, out B>(
//    val first: A,
//    val second: B
//)