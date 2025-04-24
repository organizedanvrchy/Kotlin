package com.vimal.practicecode

/* Coding Exercise #3
 * Write a program to swap
 * two variables
 */

import java.util.Scanner

fun main () {
  val userInput = Scanner(System.`in`)
  
  println("Enter a number for a: ")
  var userNum1 = userInput.nextInt()

  println("Enter a number for b: ")
  var userNum2 = userInput.nextInt()

  println("You entered: a = $userNum1 and b = $userNum2")

  // Simplest swap is to just flip calls in the string output
  // println("After Swapping: a = $userNum2 and b = $userNum1")
  
  var temp = userNum1
  userNum1 = userNum2
  userNum2 = temp

  println("After swapping: a = $userNum1 and b = $userNum2")
}
