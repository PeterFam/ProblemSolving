package com.peterfam.problemsolving.problems

import android.util.Log

fun migratoryBirds(arr: Array<Int>): Int {

    var birdType = 0
    var bird = 0
    var birdMap: HashMap<Int, Int> = HashMap()
    for (i in arr.indices) {
        if (birdMap.containsValue(arr[i]))
            for (j in arr) {
                if (arr[i] == j) {
                    birdType++
                }
            }
        if (birdType > 0) {
            birdMap[bird] = arr[i]
        }
        birdType = 0
    }


    var maxBird = birdMap.maxBy { it.key }

    return bird
}
