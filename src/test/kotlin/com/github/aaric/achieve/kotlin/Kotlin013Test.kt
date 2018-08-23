package com.github.aaric.achieve.kotlin

/**
 * Kotlin013Test
 *
 * @author Aaric, created on 2018-08-22T12:58.
 * @since 0.1.3-SNAPSHOT
 */
fun main(args: Array<String>) {
    var result = ""
    for (i in 1..5) {
        var intVal = (Math.random() * 26 + 97).toInt()
        result += intVal.toChar()
    }
    println(result)

    var c1 = 'i'
    var c2 = 'k'
    println(c1 + 4)
    println(c2 + 4)
    println(c1 - c2)
}