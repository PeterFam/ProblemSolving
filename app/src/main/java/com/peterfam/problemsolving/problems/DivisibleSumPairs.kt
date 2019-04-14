package com.peterfam.problemsolving.problems

/**
 *  HackerRank Probems "Divisible Sum Pairs"
 *  https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 *
 */

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var sumOfDivisible = 0
    var x = 0

    for (i in ar.indices) {
        for (j in x until n) {
            if (i < j) {
                    if ((ar[i] + ar[j]).rem(k) == 0) {
                        sumOfDivisible++
                    }
                }
            }
        x++
    }
    return sumOfDivisible
}
