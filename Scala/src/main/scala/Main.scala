object Main extends App {
  (1 to 100)
    .map(FizzBuzz.eval)
    .foreach(println)
}
