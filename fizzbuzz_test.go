package main

import "testing"

func TestFizzBuzz(t *testing.T) {
	cases := []struct {
		in   int
		want string
	}{
		{1, "1"},
		{3, "Fizz"},
		{5, "Buzz"},
		{15, "FizzBuzz"},
	}
	for _, c := range cases {
		got := FizzBuzz(c.in)
		if got != c.want {
			t.Errorf("fizzbuzz(%q) == %q, want %q", c.in, got, c.want)
		}
	}
}
