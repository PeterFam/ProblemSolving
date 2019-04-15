package com.peterfam.problemsolving.problems

import android.util.Log

fun migratoryBirds(arr: Array<Int>): Int {

    var birdTypeCount = 0
    var birdType = 0
    var bird = arr.max()
    for (i in arr.indices) {
        for (j in arr) {
            if (arr[i] == j) {
                birdType++
            }
        }
        if ((birdType > birdTypeCount) && (arr[i] < bird!!)) {

                birdTypeCount = birdType
                bird = arr[i]
        }
        birdType = 0
    }
//    Log.d("BirdsMap", map.toString())
    return bird!!
}
