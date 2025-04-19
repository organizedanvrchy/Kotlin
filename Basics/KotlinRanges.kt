package com.vimal.practicecode

fun main() {
    /* Range:
       Interval between two values
     */

    // Closed Range: startVal..endVal (Inclusive)
    val range = 1..5

    // Half-Open Range: startVal until endVal (Exclusive)
    val range2 = 1 until 5

    // Iterating through a specific range
    for (i in range) {
        println(i)
    }

    for (j in range2) {
        println(j)
    }
}