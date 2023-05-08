

fun main() {

    val child = Person("Child", "Child", 2)

    val p1 = Person("Tom", "Jones", 35, child)
    println(p1.children[0].age)

    val rectangle1 = Rectangle(5.0, 2.0)
    println("Perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 2.0)
    println(rectangle1 == rectangle2) // true

    println(rectangle1)

}

//Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {

    var children: MutableList<Person> = mutableListOf();

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person)
            :this(firstName,lastName,age)  {
                children.add(child)
    }

    // конструктор без аргументов
    constructor(): this("","",-1)

}


data class Rectangle(var height: Double, var lenght: Double) {
    var perimeter = (height + lenght) * 2

    var test = 1
        get() = field +1 // field == field
        set(value) {
            if(value<0){
                println("Negative value")
            }
            field = value
        }

    fun area(): Double = height * lenght

}

