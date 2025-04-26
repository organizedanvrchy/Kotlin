/* Code Exercise #8
 * Write a program that takes 3 numbers
 * from the user and prints the greatest
 * number among them
 */

import java.util.Scanner

fun main() {
  val usrInput = Scanner(System.`in`)

  val stop = 3
  var count = 0
  var usrArr = IntArray(stop)
  println("Please Enter Three(3) Numbers")
  for (i in 0 until stop) {
    count++
    print("Number $count: ")
    usrArr[i] = usrInput.nextInt()
  }
  
  println("\nYour numbers are: ")
  for (i in 0 until stop) {
    print("${usrArr[i]} ")
  }
  
  var greatest = 0
  for (i in 0 until stop) {
    if (usrArr[i] > greatest) {
      greatest = usrArr[i]
    }
  }
    
  println("\n\nThe largest element in your array is: $greatest")
}


