package com.github.aaric.achieve.kotlin

/**
 * Kotlin014Test
 *
 * @author Aaric, created on 2018-08-23T09:40.
 * @since 0.1.2-SNAPSHOT
 */
fun main(args: Array<String>) {
    var rect = Rect(3, 4)
    println(rect.getName())
    println(rect.area())

    var cube = Cube(3, 4, 5)
    println(cube.getName())
    print(cube.area())
}

interface Shape {
    fun area(): Int
}

abstract class Graph {
    abstract fun show()
}

open class Rect(length: Int, width: Int) : Graph(), Shape {

    var length: Int = length
    var width: Int = width

    init {
        println("length: $length, width: $width")
    }

    open fun getName(): String {
        return "Rect"
    }

    override fun area(): Int {
        return length * width
    }

    override fun show() {
        println(getName())
    }
}

class Cube(length: Int, width: Int, height: Int) : Rect(length, width), Shape {

    var height: Int = height

    init {
        println("height: $height")
    }

    override fun getName(): String {
        return "Cube"
    }

    override fun area(): Int {
        return (height * width + length * height + width * height) * 2
    }
}