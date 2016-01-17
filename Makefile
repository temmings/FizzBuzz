test: *.py
	python -m doctest $<

clean: *.pyc
	rm $<
