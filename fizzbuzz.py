# coding: utf-8
from __future__ import print_function

def is_multiple(n, divide):
    """
    >>> is_multiple(0, 1)
    False
    >>> is_multiple(10, 1)
    True
    >>> is_multiple(10, 2)
    True
    >>> is_multiple(10, 3)
    False
    """
    return (0 != n) and (0 == (n % divide))

def fizz(n):
    return 'Fizz' if is_multiple(n, 3) else ''

def buzz(n):
    return 'Buzz' if is_multiple(n, 5) else ''

def fizz_buzz(n):
    """
    >>> fizz_buzz(1)
    '1'
    >>> fizz_buzz(3)
    'Fizz'
    >>> fizz_buzz(5)
    'Buzz'
    >>> fizz_buzz(15)
    'FizzBuzz'
    """
    return fizz(n) + buzz(n) or str(n)

def main():
    COUNT = 100
    map(print, map(fizz_buzz, range(1, COUNT+1)))

if __name__ == '__main__':
    main()

