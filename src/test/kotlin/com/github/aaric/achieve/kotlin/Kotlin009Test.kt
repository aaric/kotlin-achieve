package com.github.aaric.achieve.kotlin

/**
 * Kotlin009Test
 *
 * @author Aaric, created on 2018-08-21T12:47.
 * @since 0.1.2-SNAPSHOT
 */
fun main(args: Array<String>) {
    println(ballArea(r = 2.0))
}

fun ballArea(pi: Double = 3.14, r: Double): Double {
    return 4 * pi * Math.pow(r, 2.0)
}