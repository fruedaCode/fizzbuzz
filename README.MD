* FizzBuzz Game TDD

This is an example of TDD with spock framework and kotlin implementation

** What we want to do?
An implementation of the well-known party / drinking game.

- When passed an argument divisible by 3 the function should return `fizz`.
- When passed an argument divisible by 5 the function should return `buzz`.
- When passed an argument divisible by 3 _and_ 5 the function should return `fizzbuzz`.
- When passed any other argument the function should return the argument.

For example:
FizzBuzz().apply(3) >> "fizz" <br />
FizzBuzz().apply(6) >> "fizz" <br />
FizzBuzz().apply(5) >> "fizz" <br />
FizzBuzz().apply(10) >> "fizz" <br />
FizzBuzz().apply(15) >> "fizzbuzz" <br />
FizzBuzz().apply(30) >> "fizzbuzz" <br />
FizzBuzz().apply(4) >> "4" <br />



* Requirements

** JDK 8
** Git

* Get started

----
git clone https://github.com/fuedacode/fizzbuzz.git
cd fizzbuzz
../gradlew
----
