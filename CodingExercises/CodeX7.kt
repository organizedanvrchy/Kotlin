/* Coding Exercise #7
 * Write a program to count the number
 * of even and odd elements in a given
 * array of integers.
 */

import java.util.Scanner

fun main() {
  val usrInput = Scanner(System.`in`)

  println("Enter the size of your array: ")
  var arrSize = usrInput.nextInt()
  var usrArr = IntArray(arrSize)

  for (i in 0 until arrSize) {
    println("Enter array element: ")
    usrArr[i] = usrInput.nextInt()
  }

  println("Elements in your array: ")
  print("[ ")
  for (i in 0 until arrSize) {
    print("${usrArr[i]} ")
  }
  print("]")

  var evenCount = 0
  var oddCount = 0

  for (i in usrArr) {
    if (i % 2 == 0) {
      evenCount++
    } else {
      oddCount++
    }
  }

  println("\n# of Even Elements: $evenCount")
  println("# of Odd Elements: $oddCount")
}
