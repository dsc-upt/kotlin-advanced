package com.example.kotlinadvanced

/**
 * A lambda in all its glory, with explicit types everywhere.
 * The lambda is the part in curly braces,
 * which is assigned to a variable of type (String) -> String (a function type).
 */

val upperCase1: (String) -> String = { str: String -> str.uppercase() }

val upperCase2: (String) -> String = { str -> str.uppercase() }

val upperCase3 = { str: String -> str.uppercase() }

// val upperCase4 = { str -> str.uppercase() }

val upperCase5: (String) -> String = { it.uppercase() }

fun main() {
    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
}