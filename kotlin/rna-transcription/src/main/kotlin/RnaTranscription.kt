import java.lang.Exception

fun transcribeToRna(dna: String): String = dna.toCharArray().map {
    when (it) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else -> throw Exception("Unknown component $it")
    }
}.joinToString("")
