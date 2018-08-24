package com.github.aaric.achieve.kotlin

/**
 * Kotlin016Test
 *
 * @author Aaric, created on 2018-08-24T17:45.
 * @since 0.1.3-SNAPSHOT
 */
fun main(args: Array<String>) {
    println(Geo.v1.ordinal)
    println(Geo.v2.name)
}

enum class Geo {
    v1, v2
}