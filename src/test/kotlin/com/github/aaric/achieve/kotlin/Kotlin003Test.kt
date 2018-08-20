package com.github.aaric.achieve.kotlin

/**
 * Kotlin003Test
 *
 * @author Aaric, created on 2018-08-20T12:56.
 * @since 0.1.0-SNAPSHOT
 */
fun main(args: Array<String>) {
    println("${heat("water")}")
    println("${heat(null)}")
}

fun heat(str: String?):String {
    return "hot ${str}"
}