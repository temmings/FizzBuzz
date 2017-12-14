import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

object FizzBuzzSpec: Spek({
    describe("A FizzBuzz") {
        on("from a multiple of three only") {
            it("should return 'Fizz'") {
                assertEquals("Fizz", FizzBuzz.eval(3))
                assertEquals("Fizz", FizzBuzz.eval(6))
                assertEquals("Fizz", FizzBuzz.eval(9))
            }
        }
        on("from a multiple of five only") {
            it("should return 'Buzz'") {
                assertEquals("Buzz", FizzBuzz.eval(5))
                assertEquals("Buzz", FizzBuzz.eval(10))
            }
        }
        on("from a multiple of three and five") {
            it("should return 'FizzBuzz'") {
                assertEquals("FizzBuzz", FizzBuzz.eval(15))
                assertEquals("FizzBuzz", FizzBuzz.eval(30))
            }
        }
        on("from a non multiple of three or five") {
            it("should return the stringified input") {
                assertEquals("1", FizzBuzz.eval(1))
                assertEquals("2", FizzBuzz.eval(2))
                assertEquals("4", FizzBuzz.eval(4))
            }
        }
    }
})
