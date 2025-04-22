package com.vimal.kotlinbasics

fun main() {
  /* Lists:
   * Ordered collection in which we can access elements
   * by using indices that define a position for each 
   * element.
   */

  // Immutable List: read-only list 
  // val something = listOf<type>(Parameters)
  val fruits = listOf("Apple", "Banana", "Cherry")

  // Accessing elements in an immutable list 
  for (item in fruits) {
    println(item)
  }

  // Mutable List: Supports both read and write functions
  // val vegetables = mutableListOf<String>("")
  val vegetables = mutableListOf("Potato", "Tomato", "Broccoli")

  // Adding elements
  vegetables.add("Carrots")
 
  // Removing elements
  vegetables.removeAt(0)
  
  // Updating elements
  vegetables[1] = "Garlic"
 
  // Printing all elements
  for (item in vegetables) {
    println(item)
  }
  
  /* Set:
   * A collection of unordered unique elements
   */

  // Immutable Sets
  val colors = setOf("Red", "Green", "Blue")
  
  // Accessing elements in an Immutable set
  for (color in colors) {
    println(color)
  }
  
  // Mutable Sets
  val carBrands = mutableSetOf("Audi", "Toyota", "Honda")

  // Adding elements
  carBrands.add("Ford")
  // Duplicate additions do not result in duplicate elements
  carBrands.add("Audi") 

  // Removing elements
  carBrands.remove("Honda")

  // Updating elements
  carBrands.remove("Audi")
  carBrands.add("Nissan")

  // Printing all elements
  for (brand in carBrands) {
    println(brand)
  }

  /* Map:
   * An object that maps keys to values
   * - Keys are unique
   * - Values can be duplicates
   */

  // Immutable maps
  val countries = mapOf("America" to 1000000, "Guyana" to 500000, "Ecuador" to 750000)

  // Accessing Map elements
  val population = countries["America"]
  println("The population of America is: $population")
  
  // Mutable maps
  val fruitsPrice = mutableMapOf("Apple" to 2.5, "Banana" to 3.25, "Cherry" to 5.0)

  // Adding elements
  fruitsPrice.put("Orange", 6.0)

  // Updating elements
  fruitsPrice["Banana"] = 3.5

  // Printing all map elements
  for ((key, value) in fruitsPrice) {
    println("Fruit: $key, Price: $value")
  }

}
