test: test-py test-hs test-go test-scala

test-py: *.py
	python -m doctest $<

test-hs:
	cabal test

test-go:
	go test

test-scala:
	sbt test

clean:
	rm -f fizzbuzz *.pyc
