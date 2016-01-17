test: test-py test-hs

test-py: *.py
	python -m doctest $<

test-hs: *.hs
	doctest $<

clean:
	rm -f fizzbuzz *.pyc *.hi *.o
