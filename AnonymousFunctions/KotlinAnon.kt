package com.vimal.practicecode

/* Anonymous Functions
 * A function without a name!
 * Similar to Lambda functions but allow for explicit declaration of return types.
 *
 * Syntax:
 * val varName: (DataType1, DataType2) -> ReturnType = fun(param1, param2): ReturnType { methodBody }
 * ** or **
 * val varName = fun(DataType1, DataType2): ReturnType { methodBody }
 *
 * Example:
 * val add: (Int, Int) -> Int = fun(a, b): Int { return a + b }
 */

fun main() {
  // Anonymous Functions:
  val numbers = listOf(1, 2, 3, 4, 5)

  // Anonymous function to square numbers
  val squareNumbersAnonFunc = fun(x:Int): Int {
    return x * x
  }

  val squaredNumbers = numbers.map(squareNumbersAnonFunc)
  println(squaredNumbers)
  
  // Types of Anonymous Functions
  // 1) With Parameters and Return Value
  val multiply = fun(a:Int, b:Int): Int {
    return a * b 
  }
  println(multiply(5, 6))

  // 2) With Parameters and no Return Value
  val multiply2 = fun(a:Int, b:Int) {
    println(a * b)
  }
  multiply2(4, 5)
  
  // 3) No Parameters with Return Value
  val msg = fun(): String {
    return "Hello"
  }
  println(msg())
  
  // 4) No Parameters and no Return Value
  val msg2 = fun(): Unit {
    println("Hello Again!")
  }
  msg2()
}



