object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        var result = mutableMapOf<Char, Int>()
        for((point, letters) in source) {
            letters.forEach {
                result.put(it.lowercaseChar(), point)   
            }
        }
        return result
    }
}
