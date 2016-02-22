build: fizzbuzz

fizzbuzz: fizzbuzz.ml main.ml
	ocamlc $^ -o $@

test-build: fizzbuzz.ml test_fizzbuzz.ml
	ocamlfind ocamlc -package oUnit -linkpkg -g $^ -o $@

test: test-build
	./$<

clean:
	rm -f *.cmi *.cmo fizzbuzz test-build oUnit-*.cache oUnit-*.log
