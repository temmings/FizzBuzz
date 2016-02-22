use std::borrow::Cow;

pub fn fizz_buzz(n: i32) -> Cow<'static, str> {
    if 0 == n % 15 {
        "FizzBuzz".into()
    } else if 0 == n % 3 {
        "Fizz".into()
    } else if 0 == n % 5 {
        "Buzz".into()
    } else {
        n.to_string().into()
    }
}
