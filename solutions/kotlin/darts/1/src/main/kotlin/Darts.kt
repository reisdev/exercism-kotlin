object Darts {
    fun score(x: Number, y: Number): Int {
        val radius = x.toDouble() * x.toDouble() + y.toDouble() * y.toDouble()
        return when {
            radius <= 1.0 -> 10
            radius <= 25.0 -> 5
            radius <= 100.0 -> 1
            else -> 0
        }
    }
}
