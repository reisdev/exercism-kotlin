object Isogram {

    fun isIsogram(input: String): Boolean {
        val letters = input.filter { it.isLetter() }.map { it.lowercaseChar() }.toList()
        val uniqueLetters = letters.toSet()
        return letters.count() == uniqueLetters.count()
    }
}
