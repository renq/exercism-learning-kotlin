import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(inputDateTime: LocalDateTime) {
    val date: LocalDateTime = inputDateTime.plusSeconds(1000000000)

    constructor(inputDate: LocalDate): this(inputDate.atStartOfDay())
}
