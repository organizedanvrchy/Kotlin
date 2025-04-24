package com.vimal.practicecode

fun main() {
  /* Higher Order Functions:
   * Functions that take a function as a parameter,
   * or returns a functions, or both.
   *
   * In general, Lambda expressions are passed as an
   * argument to higher-order functions or returned
   * from it. Anonymous functions can also be used in
   * this way.
   */
  
  // Various ways to call higher-order functions
  val addResult = operateOnNumbers(5, 3) { x, y, -> x + y }
  val multiplyResult = operateOnNumbers(6, 2) { x, y -> x * y }

  println("Addition Result: $addResult")
  println("Multiplication Result: $multiplyResult\n")

  /* it Keyword:
   * Implicit name for a single parameter in a lambda expression
   * or anonymous function when that lambda or function takes
   * only one parameter.
   */   

  val numbers = listOf(1, 2, 3, 4, 5)
  
  // Using Lambda expressions to square every number 
  val sqrdNums = numbers.map { x:Int -> x * x }
  println(sqrdNums)

  // Using Anonymous functions to square every number
  val sqrdNumsAnon = fun(x:Int): Int {
    return x * x
  }
  println(numbers.map(sqrdNumsAnon))

  // Using it Keyword
  val sqrdNums2 = numbers.map{ it * it }
  println(sqrdNums2)

  val evenNums = numbers.filter{ it % 2 == 0 }
  println(evenNums)

  /* Or use Lambda expression as:
   * val evenNums = numbers.filter{ x:Int -> x % 2 == 0 }
   * println(evenNums)
   */

}

// Higher Order function with 3 parameters
fun operateOnNumbers(a:Int, b:Int, operation:(Int, Int) -> Int): Int {
  return operation(a, b)
}

