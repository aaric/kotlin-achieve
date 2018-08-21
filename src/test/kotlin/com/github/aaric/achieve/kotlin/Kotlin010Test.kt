package com.github.aaric.achieve.kotlin

/**
 * Kotlin010Test
 *
 * @author Aaric, created on 2018-08-21T12:54.
 * @since 0.1.2-SNAPSHOT
 */
fun main(args: Array<String>) {
    var string = "13"
    var number = 13

    string = number.toString()
    number = string.toInt()

    println(string)
    println(number)
}