package com.github.aaric.achieve.kotlin

/**
 * Kotlin008Test
 *
 * @author Aaric, created on 2018-08-21T12:37.
 * @since 0.1.1-SNAPSHOT
 */
fun main(args: Array<String>) {
    println(add1(3, 5))

    var add2 = { x: Int, y: Int -> x + y }
    println(add2(3, 5))

    var add3: (Int, Int) -> Int = { x, y -> x + y }
    println(add3(3, 5))
}

fun add1(x: Int, y: Int): Int = x + y

//fun add(x: Int, y: Int): Int {
//    return x + y
//}