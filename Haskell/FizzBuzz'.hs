module FizzBuzz' where

-- | Compute Fizz-Buzz with case
-- >>> fizzBuzz' 1
-- "1"
-- >>> fizzBuzz' 3
-- "Fizz"
-- >>> fizzBuzz' 5
-- "Buzz"
-- >>> fizzBuzz' 15
-- "FizzBuzz"
fizzBuzz' n =
  case (n `mod` 3, n `mod` 5) of
    (0, 0) -> "FizzBuzz"
    (0, _) -> "Fizz"
    (_, 0) -> "Buzz"
    _ -> show n

main = mapM_ (putStrLn . fizzBuzz') [1..100]
