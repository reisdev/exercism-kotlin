object EliudsEggs {
    fun eggCount(number: Int): Int {
        var eggs = 0
        for (it in number.toString(2)) {
            if(it == '1') {
                eggs += 1
            }
        }
        return eggs
    }
}
