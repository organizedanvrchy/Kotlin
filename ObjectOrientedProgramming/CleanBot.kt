package com.vimal.practicecode

class CleanBot(name: String): Robot(name) {
    fun cleanHouse() {
        println("The robot is currently cleaning the house.")
    }
    override fun start() {
        println("Robot is starting...")
    }
    override fun stop() {
        println("Robot is stopping...")
    }
}