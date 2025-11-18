object Bob {
    fun hey(input: String): String {
        return when {
            input.trim().endsWith("?") && input.isAllCaps() -> "Calm down, I know what I'm doing!"
            input.trim().endsWith("?") -> "Sure."
            input.isAllCaps() -> "Whoa, chill out!"
            input.isEmpty() || input.all { it.isWhitespace() } -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }
}

fun String.isAllCaps(): Boolean {
    val letters = this.filter { it.isLetter() }
    if (letters.isEmpty()) return false
    return letters.all { it.isUpperCase() }
}