package com.vimal.practicecode

/* General Class with common functions
   between all other classes
 */

/* The 'open' keyword:
   This indicates that the class can be
   inherited or overwritten by other classes
   or functions in other parts of the code
 */

/* It is also possible to remove the primary
   constructor '()' from the Robot class below.
   This allows for the removal of the 'this()'
   keyword from the primary and secondary
   constructors below
 */

/* Abstract Classes:
   Cannot be instantiated by their own, and are
   typically meant to be subclasses
 */

// Alternative: open class Robot {
abstract class Robot():RobotAction {
    /* Visibility Modifiers"
       - Public (Default): Visible everywhere
       - Private: Not accessible from other classes
       - Protected: Visible within class and subclasses
       - Internal: Visible within same module (package)
     */

    // Class Variables
    var name: String = ""
    var modelYear: String = ""

    // Getters and Setters
    // get() = field               // getter
    // set(value) {field = value}  // setter

    // Custom Getter
    get() {
        println("Getting the model year. Please wait...")
        return field
    }

    // Custom Setter
    set(value) {
        println("Changing the model year. Please wait...")

        if(value.equals("1969")) {
            println("This robot is too old!")
        } else {
            field = value
        }
    }

    /* init Block:
       Executes code when an instance
       of a class is created.
     */
    init {
        println("\nA new robot is born!")
    }

    /* Secondary Constructors:
       Additional constructors that are defined
       in a class the allow for alternative ways
       to create instances of that class

       Example:
       If the 'val modelYear: String' parameter
       was added above to the 'Robot' class, then;
       the previously created classes no longer function
       since they do not explicitly declare variables for
       all of the 'Robot' classes variables!

       Thus, the parameters must be removed from the
       original class declaration and placed into
       constructors
     */

    // New Primary Constructor
    // Alternative: constructor(name: String, modelYear:String) {
    constructor(name: String, modelYear:String): this() {
        this.name = name
        this.modelYear = modelYear
    }

    // Secondary Constructor
    // Alternative: constructor(name: String){
    constructor(name: String): this()  {
        this.name = name
        this.modelYear = "Unknown model year"
    }

    /* Abstract Functions:
       Do not have an implementation in the abstract
       class but must be implemented in all subclasses

       Example:
       abstract fun start() is declared with no body
       in this 'Robot' parent class
     */

    fun walk() {
        println("The robot, $name, is now walking!")
    }
    fun speak(message: String) {
        println("$name says: $message")
    }
}