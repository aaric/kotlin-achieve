package com.github.aaric.achieve.kotlin

/**
 * Kotlin014Test
 *
 * @author Aaric, created on 2018-08-23T09:40.
 * @since 0.1.4-SNAPSHOT
 */
fun main(args: Array<String>) {
    var rect = Rect(3, 4)
    println(rect.area())

    var cube = Cube(3, 4, 5)
    println(cube.area())
}

open class Rect(length: Int, width: Int) {
    open fun area(): Int {
        return 0
    }
}

class Cube(length: Int, width: Int, height: Int) : Rect(length, width) {
    override fun area(): Int {
        return 0
    }
}