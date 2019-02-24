fun twofer(first: String? = null): String {
    if (null == first) {
        return "One for you, one for me."
    }

    return "One for $first, one for me."
}
