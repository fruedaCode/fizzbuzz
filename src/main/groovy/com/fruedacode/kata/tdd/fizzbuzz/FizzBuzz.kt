package com.fruedacode.kata.tdd.fizzbuzz

class FizzBuzz{
    fun apply(input: Int) : String{
        if(input % 15 == 0) return "fizzbuzz"
        if(input % 3 == 0) return "fizz"
        if(input % 5 == 0) return "buzz"

        return input.toString()
    }
}
