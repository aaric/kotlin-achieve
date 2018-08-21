package com.github.aaric.achieve.kotlin

/**
 * Kotlin011Test
 *
 * @author Aaric, created on 2018-08-21T12:59.
 * @since 0.1.2-SNAPSHOT
 */
fun main(args: Array<String>) {
    print("Input number 1: ")
    var num1Str = readLine()

    print("Input number 2: ")
    var num2Str = readLine()

    try {
        var num1: Int = num1Str!!.toInt()
        var num2: Int = num2Str!!.toInt()

        println("$num1 + $num2 = ${num1 + num2}")
    } catch (e: Exception) {
        println("error: input number")
    }
}