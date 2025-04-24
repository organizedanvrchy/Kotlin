package com.vimal.practicecode

/* Coding Exercise #4
 * Write a program to count the letters, 
 * spaces, numbers, and other characters
 * of an input string
 */

fun main() {
  println("Enter a message: ")
  var userString = readLine() ?: ""
  
  var count = 0
  for (char in userString){
    count++
  }

  println("The total length of the string is: $count")
}
