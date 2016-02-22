open OUnit2 ;;

open Fizzbuzz ;;

let _ = run_test_tt_main begin
  "tests" >::: [
    "test multiple of 3 to Fizz" >:: begin fun test_ctxt ->
      assert_equal (fizzbuzz 3) "Fizz"
    end;
    "test multiple of 5 to Buzz" >:: begin fun test_ctxt ->
      assert_equal (fizzbuzz 5) "Buzz"
    end;
    "test multiple of 15 to FizzBuzz" >:: begin fun test_ctxt ->
      assert_equal (fizzbuzz 15) "FizzBuzz"
    end;
    "test else to stringify number" >:: begin fun test_ctxt ->
      assert_equal (fizzbuzz 1) "1"
    end;
  ]
end
