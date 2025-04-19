package com.vimal.practicecode

fun main() {
    /* Array:
       A collection of elements of the
       same data type organized in a
       specific order and accessed by
       an index
     */

    // Array Declaration
    val osNames = arrayOf("Windows", "MacOS", "Linux")

    // Accessing Elements
    val firstElement = osNames[0]
    println(firstElement)

    // Modifying Elements
    osNames[1] = "iOS"
    println(osNames[1])

    // Array Size
    val size = osNames.size
    println("The array size is: $size")

    // Iterating through an array
    for (name in osNames) {
        println(name)
    }

    osNames.forEach { name -> println(name) }   // Alternative
}