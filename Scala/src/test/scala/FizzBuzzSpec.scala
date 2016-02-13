import org.scalatest._

class FizzBuzzSpec extends FunSpec {
  describe("A FizzBuzz") {

    it("should return 'Fizz' from a multiple of three only") {
      assert(FizzBuzz.eval(3) == "Fizz")
      assert(FizzBuzz.eval(6) == "Fizz")
      assert(FizzBuzz.eval(9) == "Fizz")
    }
    it("should return 'Buzz' from a multiple of five only") {
      assert(FizzBuzz.eval(5) == "Buzz")
      assert(FizzBuzz.eval(10) == "Buzz")
    }
    it("should return 'FizzBuzz' from a multiple of three and five") {
      assert(FizzBuzz.eval(15) == "FizzBuzz")
      assert(FizzBuzz.eval(30) == "FizzBuzz")
    }
    it("should return the stringified input from a non multiple of three or five") {
      assert(FizzBuzz.eval(1) == "1")
      assert(FizzBuzz.eval(2) == "2")
    }
  }
}

