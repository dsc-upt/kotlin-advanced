package com.example.kotlinadvanced

/**
 * Declares a higher-order function.
 * It takes two integer parameters, x and y.
 * Additionally, it takes another function operation as a parameter.
 * The operation parameters and return type are also defined in the declaration.
 */
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

private fun sum(x: Int, y: Int) = x + y

/**
 * usage of higher order functions
 */
fun example1() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }

    println("sumResult $sumResult, mulResult $mulResult")
}

/**
 * Returning functions
 */
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

/**
 * usage of higher order functions
 */
fun example2() {
    val func = operation()
    println(func(2))
}


fun main() {
    example1()
    example2()
}