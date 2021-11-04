package com.example.kotlinadvanced

/**
 * A simple function that takes a parameter of type String and returns Unit(No return value)
 */
fun printMessage(message: String): Unit {
    println(message)
}

/**
 * A function that returns an integer
 */
private fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * A single-expression function that returns an integer.
 */
fun sum2(x: Int, y: Int): Int = x + y

/**
 * Kotlin provides infix notation with which we can call a function with
 * the class object without using a dot and parentheses across the parameter.
 * call in main = 1
 */
infix fun Int.times(str: String) = str.repeat(this)

/**
 * The vararg modifier turns a parameter into a vararg.
 * This allows calling printAll with any number of string arguments.
 * call in main = 2
 */
fun printAll(vararg messages: String) {
    for (m in messages) println(m)
}

/**
 * Conditional expressions
 * There is no ternary operator "condition ? then : else" .
 * if may be used as an expression:
 */
fun max(a: Int, b: Int) = if (a > b) a else b

fun main() {
    // 1
    println(3 times "Bye ")
    // 2
    printAll("Hello", "Hallo", "Salut")
}