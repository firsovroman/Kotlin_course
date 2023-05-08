package jetBrainsCourse.c_conventions

//data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
//
//    override fun compareTo(other: MyDate): Int {
//        if(this.year != other.year) {
//            return (this.year - other.year)
//        }
//        if(this.month != other.month) {
//            return (this.month - other.month)
//        }
//        return (this.dayOfMonth - other.dayOfMonth)
//    }
//}

//fun test(date1: MyDate, date2: MyDate) {
//    // this code should compile:
//    println(date1 < date2)
//}





/*

Fail: testAfter: MyDate(year=2015, month=3, dayOfMonth=22) shouldn't be in range:
MyDate(year=2014, month=1, dayOfMonth=1)..MyDate(year=2015, month=1, dayOfMonth=1):
expected:<false> but was:<true>
 */


/*
Example:

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

val point = Point(10, 20)

fun main() {
   println(-point)  // prints "Point(x=-10, y=-20)"
}
 */