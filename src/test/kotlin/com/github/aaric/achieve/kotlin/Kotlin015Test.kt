package com.github.aaric.achieve.kotlin

/**
 * Kotlin015Test
 *
 * @author Aaric, created on 2018-08-24T12:57.
 * @since 0.1.4-SNAPSHOT
 */
fun main(args: Array<String>) {
//    var h1: Housework = Father()
//    var h2: Housework = Son()
//
//    h1.dishwashing()
//    h2.dishwashing()

    var h: Housework = Father()

    h.dishwashing()
}

interface Housework {
    fun dishwashing()
}

class Father : Housework by Son {

    override fun dishwashing() {
        println("Dishwashing to son.")
        Son.dishwashing()
        println("Dishwashing to pay father 9 yuan.")
    }
}

object Son : Housework {

    override fun dishwashing() {
        println("Dishwashing to pay father 1 yuan.")
    }
}
