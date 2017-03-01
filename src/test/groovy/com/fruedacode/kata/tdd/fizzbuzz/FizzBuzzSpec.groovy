package com.fruedacode.kata.tdd.fizzbuzz

import groovy.transform.CompileStatic
import spock.lang.Specification
import spock.genesis.Gen
import spock.lang.Subject
import spock.lang.Unroll
import spock.util.mop.Use

@Use(IntegerExtensions)
class FizzBuzzSpec extends Specification {

    @Subject def function = new FizzBuzz()

    @Unroll("fizzbuzz(#n) returns 'fizz'")
    def "an argument divisible by 3 returns 'fizz'"() {
        expect:
        function.apply(n) == "fizz"

        where:
        n << Gen.integer
                .filter { it.isMultipleOf(3) && !it.isMultipleOf(5) }
                .take(20)
    }

    def "multiples of three return fizz"(){
        when: "pass 6"

        then: "expect fizz"
        function.apply(6).equals("fizz")
    }
    def "multiples of five return buzz"(){
        given: def function = new FizzBuzz()
        when: "pass 5"

        then: "expect buzz"
        function.apply(5).equals("buzz")
    }
    def "multiples of five and three return fizzbuzz"(){
        given: def function = new FizzBuzz()
        when: "pass 15"

        then: "expect buzz"
        function.apply(15).equals("fizzbuzz")
    }
    def "non multiples of five or three return the argument passed"(){
        given: def function = new FizzBuzz()
        when: "pass 2"

        then: "expect 2"
        function.apply(2).equals("2")
    }
}

@Category(Integer)
@CompileStatic
class IntegerExtensions {
    boolean isMultipleOf(int n) {
        this % n == 0
    }
}

