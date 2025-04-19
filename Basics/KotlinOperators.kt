package com.vimal.practicecode

fun main() {
    // Arithmetic Operators: + - / % ++ --
    val add : Int = 5 + 3
    println("The result is $add")

    val sub : Int = 6 - 5
    println("The result is $sub")

    val div : Int = 6 / 3
    println("The result is $div")

    val mod : Int = 5 % 4
    println("The result is $mod")

    var x : Int = 0
    val increment : Int = ++x
    println("x is now $increment")

    var y : Int = 10
    val decrement : Int = --y
    println("y is now $decrement")

    // Logical Operators: && || !
    val and : Boolean = true && false
    println("The result is $and")

    val or : Boolean = true || false
    println("The result is $or")

    val not : Boolean = !true
    println("The result is $not")

    // Assignment Operators: = += -= *= /= %=
    var a : Int = 5
    println("The value of a is $a")

    a += 4
    println("The value of a is now $a")

    a -= 3
    println("The value of a is now $a")

    a *= 2
    println("The value of a is now $a")

    a %= 5
    println("The value of a is now $a")

    // Relational or Comparison Operators: == != > < >= <=
    val i : Int = 15
    val j : Int = 20

    if (i == j) {
        println("The numbers are equal")
    }

    if (i != j) {
        println("The numbers are not equal")
    }

    if (i > j) {
        println("i is greater than j")
    }

    if (i < j) {
        println("i is less than j")
    }

    if (i >= j) {
        println("i is greater than or equal to j")
    }

    if (i <= j) {
        println("i is less than or equal to j")
    }
}