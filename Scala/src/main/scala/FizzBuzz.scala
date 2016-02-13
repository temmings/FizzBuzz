object FizzBuzz {
  def eval(n: Int) = {
    val fizz = (n % 3) == 0
    val buzz = (n % 5) == 0
    if (fizz && buzz)
      "FizzBuzz"
    else if (fizz)
      "Fizz"
    else if (buzz)
      "Buzz"
    else
      n.toString()
  }

  def main(args: Array[String]) = {
    for (i <- 1 to 100) {
      println(FizzBuzz.eval(i))
    }
  }
}
