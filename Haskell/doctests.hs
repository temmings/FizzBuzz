module Main where

import Test.DocTest

main :: IO ()
main = doctest ["FizzBuzz.hs", "FizzBuzz'.hs"]
