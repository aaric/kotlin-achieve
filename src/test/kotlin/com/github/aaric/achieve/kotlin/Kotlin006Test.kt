package com.github.aaric.achieve.kotlin

/**
 * Kotlin006Test
 *
 * @author Aaric, created on 2018-08-20T18:39.
 * @since 0.0.1-SNAPSHOT
 */
fun main(args: Array<String>) {
    //var numbers = 1 .. 100 //[1, 100]
    var numbers = 1 until 100 //[1, 100)
    for (i in numbers.reversed() step 2) {
        println(i)
    }
    println(numbers.count())
}