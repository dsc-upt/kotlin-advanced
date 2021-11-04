package com.example.kotlinadvanced

val numbers = listOf(1, -2, 3, -4, 5, -6)

/**
 * .filter
 *
 * filter function enables you to filter collections.
 * It takes a filter predicate as a lambda-parameter.
 * The predicate is applied to each element.
 * Elements that make the predicate true are returned in the result collection.
 */

val positives = numbers.filter { x -> x > 0 }

val negatives = numbers.filter { it < 0 }

/**
 * .map
 * map extension function enables you to apply a transformation to all elements in a collection.
 * It takes a transformer function as a lambda-parameter.
 */

val doubled = numbers.map { x -> x * 2 }

val tripled = numbers.map { it * 3 }

/**
 * .any
 * Function any returns true if the collection contains at least one element that matches the given predicate.
 */

val anyNegative = numbers.any { it < 0 } // tue

/**
 * .all
 * Function all returns true if all elements in collection match the given predicate.
 */

val allEven = numbers.all { it % 2 == 0 }

/**
 * .none
 * Function none returns true if there are no elements that match the given predicate in the collection.
 */

val allEvenWithNone = numbers.none { it % 2 == 1 }

/**
 * .count
 * count functions returns either the total number of elements in a collection or the number of elements matching the given predicate.
 */

val totalCount = numbers.count()
val evenCount = numbers.count { it % 2 == 0 }

/**
 * .partition
 *
 * The partition function splits the original collection into a pair of lists using a given predicate:
 * Elements for which the predicate is true.
 * Elements for which the predicate is false.
 */

fun partition() {
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }
}

/**
 * .zip
 * zip function merges two given collections into a new collection.
 * By default, the result collection contains Pairs of source collection elements with the same index.
 * However, you can define own structure of the result collection element.
 */

val A = listOf("a", "b", "c")
val B = listOf(1, 2, 3, 4)

val resultPairs = A zip B
val resultReduce = A.zip(B) { a, b -> "$a$b" }

/**
 * .getOrElse
 * getOrElse provides safe access to elements of a collection.
 * It takes an index and a function that provides the default value in cases when the index is out of bound.
 */

fun example() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })
}