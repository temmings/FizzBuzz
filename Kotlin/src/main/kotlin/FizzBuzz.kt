object FizzBuzz {
    fun eval(n: Int): String {
        val (a, b) = Pair(n % 3, n % 5)
        if (a == 0 && b == 0) return "FizzBuzz"
        if (a == 0) return "Fizz"
        if (b == 0) return "Buzz"
        // こんな感じの値でのマッチは書けない？
        //when (Pair(n % 3, n % 5)) {
        //    Pair(0, 0) -> return "FizzBuzz"
        //    is #(0, *) -> return "Fizz"
        //    is #(*, *) -> return "Fizz"
        //}
        return n.toString()
    }
}
