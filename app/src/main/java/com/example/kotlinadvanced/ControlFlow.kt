package com.example.kotlinadvanced

/**
 * Equality checks
 * Kotlin uses == for structural comparison and === for referential comparison.
 * More precisely, a == b compiles down to if (a == null) b == null else a.equals(b)
 */
fun equalityCheck() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)

    // Returns false because authors and writers are distinct references.
    println(authors === writers)

}

fun main() {
    //equalityCheck()
}