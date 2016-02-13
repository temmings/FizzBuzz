test: test-py test-hs test-go

test-py: *.py
	python -m doctest $<

test-hs: *.hs
	doctest $<

test-go:
	go test

clean:
	rm -f fizzbuzz *.pyc *.hi *.o
