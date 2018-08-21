package com.github.aaric.achieve.kotlin

/**
 * Kotlin005Test
 *
 * @author Aaric, created on 2018-08-20T17:38.
 * @since 0.1.1-SNAPSHOT
 */
fun main(args: Array<String>) {
    var bookPrice: Byte = 79
    var a: Short = bookPrice.toShort()
    print(a)

    val byteAmount = 233
    var b: Byte = byteAmount.toByte()
    println(b)
}