package com.github.aaric.achieve.kotlin

/**
 * Kotlin012Test
 *
 * @author Aaric, created on 2018-08-21T13:06.
 * @since 0.1.2-SNAPSHOT
 */
fun main(args: Array<String>) {
    var result = 0
    println(addc(100000, result))
}

tailrec fun addc(number: Int, result: Int): Int {
    if (0 == number) {
        return result
    } else {
        return addc(number - 1, result + number)
    }
}