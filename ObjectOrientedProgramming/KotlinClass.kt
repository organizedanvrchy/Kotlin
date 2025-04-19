package com.vimal.practicecode

fun main() {
    /* Objects:
       Creating objects from the Robot Class
       with LightBot and other Bot classes
       'inheriting' the walk and speak functions
     */
    val lbot = LightBot("Robotson")
    lbot.start()
    lbot.walk()
    lbot.speak("I am the light bringer!")
    lbot.turnOnLight()

    val cbot = CleanBot("Rob")
    cbot.walk()
    cbot.cleanHouse()
    cbot.speak("I love cleaning!")

    val fbot = FireBot("Robo", "2000")
    fbot.walk()
    fbot.speak("Hands up!")
    fbot.fire()

    // Custom Getter
    println(fbot.modelYear)

    // Custom Setter
    fbot.modelYear = "1969"

    val fbot2 = FireBot("Rombo")
    fbot2.walk()
    fbot2.fire()
    fbot2.stop()

    /* If the 'Robot' class was abstract,
       ie. abstract class Robot() {}, then
       only a subclass can be used to
       instantiate the class

       Example:
       var generalRobot:Robot = FireBot("Robomaniac")
     */
}

/* Class:
   A blueprint that defines the properties
   and behaviors of objects. It encapsulates
   data and functions that operate on the data.
 */

/* Primary Constructor:
   Define and Initialize properties for a class.

   Example:
   class MyClass(parameter1: Type, parameter2: Type) {}
 */

/* Inheritance:
   Allows one class to inherit the properties
   and behaviors of another class.
 */




