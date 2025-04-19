package com.vimal.practicecode

fun main() {
    // if Statement
    val age = 30
    if (age > 18) {
        println("You are an adult")
    }

    // if-else Statement
    val score = 85
    if (score >= 60) {
        println("Pass")
    } else {
        println("Fail")
    }

    // when Expression
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Unknown Day")
    }

    // Nested Conditionals
    val isRaining = true
    val isCold = false

    if (isRaining) {
        if (isCold) {
            println("Use Umbrella and Coat")
        } else {
            println("Use only Umbrella")
        }
    } else {
        println("No need for an Umbrella")
    }
}