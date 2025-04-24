package com.vimal.practicecode

import java.util.Scanner

fun main() {
  val userInput = Scanner(System.`in`)

  println("Hello! Please enter a number: ")
  val userNum1 = userInput.nextInt()

  println("\nNice! Enter another number: ")
  val userNum2 = userInput.nextInt()

  val divideNums : Int = userNum1 / userNum2
  val remainder : Int = userNum1 % userNum2

  println("$userNum1 / $userNum2 = $divideNums\nThe remainder is: $remainder")

}
