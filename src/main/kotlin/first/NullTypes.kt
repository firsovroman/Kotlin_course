import java.time.*
import java.time.format.DateTimeFormatter


private val MOSCOW_ZONE_ID = ZoneId.of("Europe/Moscow")
private val DATE_TIME_FORMATTER = DateTimeFormatter.ISO_DATE_TIME


fun main() {

    val epoch = System.currentTimeMillis() // пример epoch

    val instant = Instant.ofEpochMilli(epoch)
    val moscowZone = ZoneId.of("Europe/Moscow")
    val moscowInstant = instant.atZone(moscowZone).toInstant()

    println(moscowInstant) // вывод московского времени в формате Instant

}

