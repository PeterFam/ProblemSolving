package com.peterfam.problemsolving.problems

/**
 *  HackerRank Probems "Apple and Orange"
 *  https://www.hackerrank.com/challenges/the-birthday-bar/problem
 *
 */
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var output = 0
    var sumEqualsMonths = 0
    var arraySize = s.size - m
    for (i in 0 until arraySize) {
        sumEqualsMonths = sumEqualsMonths - s[i] + s[i + m]
        if (sumEqualsMonths == d) output++
    }
    return output
}