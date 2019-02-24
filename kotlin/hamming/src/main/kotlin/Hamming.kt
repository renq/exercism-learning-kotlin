class Hamming {
    companion object {
        fun compute(a: String, b: String): Int {
            require(a.length == b.length) { "left and right strands must be of equal length." }

            return a.filterIndexed { index, c -> b.elementAt(index) != c }.count()
        }
    }
}
