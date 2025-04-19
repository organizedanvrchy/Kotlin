package com.vimal.practicecode

fun main() {
    /* Functions:
       Blocks of code that encapsulate a
       specific task or functionality
     */

    // Function Declaration
    // fun functionName(parameter1: Type, parameter2: Type): ReturnType {
        // Function Body
        // Perform operations
        // Optionally return a value
    // }

    // Function Call
    sayHello("Vimal")
    sayHello("John", "30")

    var res = sumTwoNumbers(10.5, 4.8)
    println(res)
}

// Basic Example
fun sayHello(name: String, age: String = "Not Specified") {
    println("Hello $name, your age is $age")
}

/* Return Types
   Unit: Similar to void (if not declared,
   kotlin will assume Unit by default)
 */
// fun someFunction(x: Int, y: Int) : Unit {
    // Function Body
// }

// Example
fun sumTwoNumbers(x: Int, y: Int) : Int {
    var z = x + y
    return z
}

/* Function Overloading:
   Allows for defining multiple functions with
   same name in the same scope but with different
   parameters
 */
fun sumTwoNumbers(x: Double, y: Double) : Double {
    var z = x + y
    return z
}