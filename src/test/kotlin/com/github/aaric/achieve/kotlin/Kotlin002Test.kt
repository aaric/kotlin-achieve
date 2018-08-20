package com.github.aaric.achieve.kotlin

/**
 * Kotlin002Test
 *
 * @author Aaric, created on 2018-08-20T12:49.
 * @since 0.1.0-SNAPSHOT
 */
fun main(args: Array<String>) {
    var m = 3
    var n = 5
    println("${m} and ${n}, max is ${max(3, 5)}")
}

fun max(m: Int, n: Int):Int {
    if(m > n) return m else return n
}