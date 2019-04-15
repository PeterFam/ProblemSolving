package com.peterfam.problemsolving.problems

/**
 *  HackerRank Problems "Migratory Birds"
 *  https://www.hackerrank.com/challenges/migratory-birds/problem
 *
 */
fun migratoryBirds(arr: Array<Int>): Int {

    var birdType = 0
    var bird = 0
    var birdValue = 0
    var birdMap: HashMap<Int, Int> = HashMap()
    for (i in arr.indices) {
        if (!birdMap.containsKey(arr[i])) {
            for (j in arr) {
                if (arr[i] == j) {
                    birdType++
                }
            }
            birdMap[arr[i]] = birdType
            birdType = 0
        }
    }

    for (i in birdMap.keys) {
        if (birdMap[i]!! > birdValue) {
            birdValue = birdMap[i]!!
            bird = i
        }
    }
    return bird
}
