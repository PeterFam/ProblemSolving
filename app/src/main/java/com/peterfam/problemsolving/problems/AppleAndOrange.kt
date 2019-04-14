package com.peterfam.problemsolving.problems

/**
 *  HackerRank Problems "Apple and Orange"
 *  https://www.hackerrank.com/challenges/apple-and-orange/problem
 *
 */
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var applesInSams = 0
    var orangesInSams = 0
    for (i in apples) {
        val checkIn = i + a
        if (checkIn in s..t) {
            applesInSams++
        }
    }
    for (j in oranges) {
        val checkIn = j + b
        if (checkIn in s..t) {
            orangesInSams++
        }
    }
    println(applesInSams)
    println(orangesInSams)
}