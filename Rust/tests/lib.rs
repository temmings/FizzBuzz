extern crate FizzBuzz;

use FizzBuzz::fizz_buzz;

#[test]
fn multiple_of_3_to_fizz() {
    assert_eq!("Fizz", fizz_buzz(3));
}

#[test]
fn multiple_of_5_to_buzz() {
    assert_eq!("Buzz", fizz_buzz(5));
}

#[test]
fn multiple_of_15_to_fizzbuzz() {
    assert_eq!("FizzBuzz", fizz_buzz(15));
}

#[test]
fn else_to_stringify_number() {
    assert_eq!("1", fizz_buzz(1));
}
