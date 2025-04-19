package com.vimal.practicecode

class LightBot (name: String): Robot(name) {
    fun turnOnLight() {
        println("The light is off")
    }
    override fun start() {
        println("Robot is starting...")
    }
    override fun stop() {
        println("Robot is stopping...")
    }
}