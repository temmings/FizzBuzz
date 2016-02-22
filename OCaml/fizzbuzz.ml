let fizzbuzz n =
    match ((n mod 3), (n mod 5)) with
        | (0, 0) -> "FizzBuzz"
        | (0, _) -> "Fizz"
        | (_, 0) -> "Buzz"
        | (_, _) -> string_of_int n
