package com.vimal.practicecode

fun main() {
    /* Kotlin provides several integer data types
       with varying sizes
     */

    // Byte: -128 to 127 (8-bit)
    val myByte : Byte = 100

    // Short: -32786 to 32767 (16-bit)
    val myShort : Short = 5000

    // Int: ~ -2147483648 to 2147483647 (32-bit)
    val myInt : Int = 123405099

    // Long: -9223372036854775808 to 9223372036854775807 (64-bit)
    val myLong : Long = 12959874573854

    // Float: Store values with fractional parts
    val myFloat : Float = 3.1256f

    // Double: Store values with greater precision
    val myDouble : Double = 2.346565777

    // Boolean: True of False
    val myBoolean : Boolean = true

    // Boolean Example
    val isRaining : Boolean = true

    if(isRaining){
        println("It is raining outside")
    } else {
        println("It is not raining")
    }

    /* Characters represent a single character
       (Letter, Digit, Symbol, or Special Characters)
     */
    var myLetter : Char = 'A'
    var myDigit : Char = '5'
    var mySymbol : Char = '%'
    var mySpecChar: Char = '\n'
}