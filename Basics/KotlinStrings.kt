package com.vimal.practicecode

fun main() {
    /* Strings are sequences of characters that
       are used to represent text.
     */

    // String Declaration
    val text1 : String = "Hello, my friends. "
    val text2 : String = "Welcome Back!"

    // String Concatenation
    val text3 = text1 + text2
    println(text3)

    // String Templates
    val name = "Jack"
    val age = 30
    val info = "My name is $name and I am $age years old"
    println(info)

    // String Interpolation
    val x = 5
    val y = 3

    val result = "The sum of $x and $y is ${x + y}"
    println(result)

    // String Functions and Properties
    val text = "Hello there!"
    val length = text.length
    val subText = text.substring(0, 5)

    println("The length of the text is: $length")
    println("The substring is: $subText")

    // String Comparison
    val str1 = "Hello"
    val str2 = "There"

    val comparisonRes = str1.equals(str2)
    println("String Comparison Result: $comparisonRes")

    // String Literals
    val newLineText = "This is the first line \nThis is the second line"
    println(newLineText)
}