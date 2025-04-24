package com.vimal.practicecode

/* Coding Exercise #2
 * Write a program that gets from the user
 * the radius and print the area and perimeter
 * of a circle
 */

import java.util.Scanner
import kotlin.math.round
import kotlin.math.pow

fun roundToDecimals(value: Double, decimals: Int): Double {
  val factor = 10.0.pow(decimals)
  return round(value * factor) / factor
}

fun main() {
  val userInput = Scanner(System.`in`)
  val piVal = roundToDecimals(Math.PI, 3)
  
  println("Hello! Enter the diameter of your circle: ")
  val diameterOfCircle = userInput.nextInt()

  val radiusOfCircle = diameterOfCircle / 2
  val perimeterOfCircle = 2 * piVal * radiusOfCircle
  val areaOfCircle = radiusOfCircle * radiusOfCircle * piVal
  
  println("The radius of the circle is: $radiusOfCircle\nThe perimeter of the circle is: $perimeterOfCircle\nThe area of the circle is: $areaOfCircle")
}
