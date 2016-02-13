package main

import (
	"fmt"
	"strconv"
)

func FizzBuzz(n int) string {
	fizz := (n % 3) == 0
	buzz := (n % 5) == 0
	switch {
	case fizz && buzz:
		return "FizzBuzz"
	case fizz:
		return "Fizz"
	case buzz:
		return "Buzz"
	default:
		return strconv.Itoa(n)
	}
}

func main() {
	for i := 1; i <= 100; i++ {
		fmt.Println(FizzBuzz(i))
	}
}
