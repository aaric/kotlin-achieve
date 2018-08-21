package com.github.aaric.achieve.kotlin

import java.util.*

/**
 * Kotlin007Test
 *
 * @author Aaric, created on 2018-08-20T18:54.
 * @since 0.1.1-SNAPSHOT
 */
fun main(args: Array<String>) {
    // list
    var list = listOf("one", "two", "three")
    for ((i, e) in list.withIndex()) {
        println("$i $e")
    }

    // map
    var map = TreeMap<Int, String>()
    map[1] = "one"
    map[2] = "two"
    map[3] = "three"
    println(map[2])
}