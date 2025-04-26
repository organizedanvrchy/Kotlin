/* Coding Exercise #6
 * Write a program to multiply coresponding
 * elements of two arrays of integers
 */

fun main() {
  val arr1 = arrayOf(1, 2, 3, 4)
  val arr2 = arrayOf(5, 6, 7, 8)
  var result = ""

  for (x in arr1.withIndex()) {
    result += " " + (arr1[x.index] * arr2[x.index])
  }  

  println(result)    
}
