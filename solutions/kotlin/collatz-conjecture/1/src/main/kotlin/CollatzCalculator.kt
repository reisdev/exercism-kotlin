object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        if (start <= 0) {
            throw IllegalArgumentException()
        }

        var result = start
        var steps = 0
        while (result > 1) {
            steps += 1
            result = when {
                result % 2 == 0 -> result/2
                else -> result * 3 + 1
            }
        }
        return steps
    }
}
