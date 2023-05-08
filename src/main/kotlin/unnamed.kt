




interface PersonFormatter {
    fun format(person: Personn?): String
}

class Address (
    val city: String,
    val street: String?
)

class Personn (
    val name: String,
    val address: Address?
)



class SimplePersonFormatter : PersonFormatter {
    override fun format(person: Personn?): String {

        if(person == null) {
            return ""
        }

        val name = person.name.capitalize()

        // Как видите, в оператор элвиса можно подставить return
        val address = person.address ?: return name

        val city = address.city.capitalize()
        val street = address.street?.toUpperCase()

        return if(street == null) {
            "$name ($city)"
        } else {
            "$name ($city, ул. $street)"
        }
    }
}


//class SimplePersonFormatter: PersonFormatter{
//
//
//    override fun format(person: Personn?): String {
//
//        if(person == null){
//            return "";
//        }
//
//        val addres: Address? = person.address ?: return person.name
//
//        if(addres?.street == null){
//            return "${person.name.capitalize()} (${addres?.city?.capitalize()})"
//        }
//
//
//        if(addres.street != null){
//            return "${person.name.capitalize()} (${addres.city.capitalize()}, ${addres.street.toUpperCase()})"
//        }
//
//        return ""
//    }
//
//
//}