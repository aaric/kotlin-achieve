package com.github.aaric.achieve.kotlin

/**
 * Kotlin004Test
 *
 * @author Aaric, created on 2018-08-20T12:59.
 * @since 0.1.0-SNAPSHOT
 */
fun main(args: Array<String>) {
    println("${grade(9)}")
}

fun grade(score: Int): String {
    return when (score) {
        10 -> "top rank"
        9 -> "better rank"
        8 -> "good rank"
        7 -> "common rank"
        6 -> "happy rank"
        else -> "lost rank"
    }
}