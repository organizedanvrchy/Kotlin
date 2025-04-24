package com.vimal.practicecode

// Kotlin Literals

/* Function Literals
 * When we assign a function to a variable, it becomes
 * a function literal. Kotlin has 2 types of function literals:
 * - Lambda Expression
 * - Anonymous Function
 */

/* Lambda Expression
 * This is a short way to create a function. Lambda expressions
 * are defined by enclosing the method body inside braces.
 *
 * Example:
 * { x, y, -> x + y }
 * where x and y are parameters.
 *
 * General Syntax:
 * val lambda: (DataType1, DataType2) -> ReturnType = { variable1: DataType1, variable2:DataType2 -> methodBody }
 *
 * where:
 * 1) Variable Name = val lambda
 * 2) Function Type = (DataType1, DataType2) -> ReturnType
 * 3) Lambda = { variable1:DataType1, variable2:DataType2 -> methodBody }
 *
 * Example:
 * val add: (Int, Int) -> Int = { a:Int, b:Int -> a + b }
 *
 * Example (Shorter Syntax):
 * val add: (Int, Int) -> Int = { a, b -> a + b }
 *
 * Example (Shortest Syntax):
 * val add: { a:Int, b:int -> a + b }
 */

/* Lambda Execution:
 * There are two ways to execute the lambda:
 * - Add parentheses after the variable name.
 * - Call invoke() method.
 * 
 * Example:
 * val printWelcome = { println("Welcome") }
 * 1) printWelcome()
 * 2) printWelcome.invoke()
 */

fun main() {
  /* Lambda Expressions:
   * Concise way to define anonymous functions.
   */

  // Basic Lambda Expressions: { parameters -> body }
  // Example:
  val add: (Int, Int) -> Int = { a, b -> a + b }
  val result = add(5, 3)
  println(result)

  // Other Types of Lambda Expressions:
  // 1) With Parameters and Return Type
  // val add: (Int, Int) -> Int = { a, b -> a + b }


  // 2) With Parameters and no Return Value
  // Unit is similar to void and signifies that lambda expression does not return any value
  val add2: (Int, Int) -> Unit = { a, b -> print(a + b) }
  add2(5, 5)


  // 3) No Parameters with Return Value
  val add3: () -> String = { "\nWelcome" }
  println(add3.invoke())

  // 4) No Parameters and no Return Value
  val add4: () -> Unit = { println("No parameters, no return value") }
  add4.invoke()

  // Direct Use of Lambda Expressions
  println({ a:Int, b:Int -> a * b} (4, 5))

}
