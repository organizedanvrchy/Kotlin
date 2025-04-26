/* Coding Exercise #5
   Write a program to reverse a string
 */

import java.util.Scanner

fun main() {
    println("Enter a message: ")
    var usrInput = Scanner(System.`in`)
    var letters = usrInput.nextLine().toCharArray()

    println("The reversed message is: ")
    reverseString(letters)
}

fun reverseString(text: CharArray) {
    var reversedString = ""
    for (i in text.size - 1 downTo 0) {
        reversedString += text[i]
    }
    print(reversedString)
}
