package com.vimal.practicecode

/* Coding Exercise #4
 * Write a program to count the letters, 
 * spaces, numbers, and other characters
 * of an input string
 */

fun main() {
  println("Enter a message: ")
  var userString = readLine() ?: ""
  
  var ct = 0
  for (char in userString){
    ct++
  }

  println("The total length of the string is: $ct")
  count(userString)
}

fun count(text: String) {

  var char = text.toCharArray()
  
  var ltr = 0
  var num = 0
  var spc = 0
  var otr = 0

  for (ch in char.withIndex()) {
    val c = ch.value
    if (c.isLetter()) {
      ltr++
    } else if (c.isDigit()) {
      num++
    } else if (c.isWhitespace()) {
      spc++
    } else {
      otr++
    }
  }

  println("\nThe string contains:")
  println("Letters: $ltr")
  println("Numbers: $num")
  println("Spaces: $spc")
  println("Others: $otr")
}
