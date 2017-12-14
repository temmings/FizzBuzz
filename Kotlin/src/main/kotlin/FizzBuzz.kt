object FizzBuzz {
    fun eval(n: Int): String {
        return Pair(n % 3 == 0, n % 5 == 0).let {
            when (it) {
                Pair(true, true) -> "FizzBuzz"
                Pair(true, false) -> "Fizz"
                Pair(false, true) -> "Buzz"
                else -> n.toString()
            }
        }
    }
}
