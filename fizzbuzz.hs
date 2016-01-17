module FizzBuzz where

-- | Compute Fizz-Buzz
-- >>> fizzBuzz 1
-- "1"
-- >>> fizzBuzz 3
-- "Fizz"
-- >>> fizzBuzz 5
-- "Buzz"
-- >>> fizzBuzz 15
-- "FizzBuzz"
fizzBuzz n
  | isFizz && isBuzz = "FizzBuzz"
  | isBuzz = "Buzz"
  | isFizz = "Fizz"
  | otherwise = show n
  where
    isFizz = (mod n 3) == 0
    isBuzz = (mod n 5) == 0

main = mapM_ (putStrLn . fizzBuzz) [1..100]
