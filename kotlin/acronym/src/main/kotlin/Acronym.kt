class Acronym {
    companion object {
        fun generate(phrase: String): String {
            return phrase.split(' ', '-').joinToString("") {
                if (it.isNotEmpty()) {
                    it[0].toUpperCase().toString()
                } else ""
            }
        }
    }
}