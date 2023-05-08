package first


fun main() {
    val hMap: MutableMap<String, Int> = HashMap()
    hMap["A"] = 65
    hMap["B"] = 66
    hMap["C"] = 67

    val entries: List<String> = hMap.toList().map { p -> p.first }.toList()
    entries.forEach { println(it) }


}