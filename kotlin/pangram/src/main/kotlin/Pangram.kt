class Pangram {
    companion object {
        fun isPangram(string: String): Boolean {
            val alphabet = CharRange('a', 'z').toMutableList()

            string.forEach { c -> alphabet.remove(c.toLowerCase()) }

            return alphabet.isEmpty()
        }
    }
}
