package com.vimal.practicecode

class FireBot: Robot {
    /* If the modelYear for this robot must
       be shown, then a constructor must be used.

       Adding the secondary constructor allows
       for instances of the Robot to be created
       with just the name!
     */

    /* super() Keyword:
       This is used to call the parent class from a
       subclass constructor. Often used when a subclass
       wants to inherit and reuse the initialization
       logic of the parent (or super) class.
     */
    constructor(name: String, modelYear: String): super(name, modelYear)
    constructor(name: String): super(name)

    fun fire() {
        println("The robot from $modelYear is firing!!!")
    }

    // In this subclass of 'Robot',
    // the abstract class 'start' can
    // be implemented as:
    // override fun start() {
    //     println("Bot is starting...")
    // }

    override fun start() {
        println("Robot is starting...")
    }
    override fun stop() {
        println("Robot is stopping...")
    }
}