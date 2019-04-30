package com.peterfam.problemsolving.arrays
/**
 *  HackerRank Problems "Arrays: Minimum Swaps 2"
 *  the simplest way to solve this problem
 *  https://www.hackerrank.com/challenges/minimum-swaps-2/problem
 */
fun minimumSwaps(arr: Array<Int>): Int {
    var minSwaps = 0
    var arraySize  = arr.size

    for(i in 0 until arraySize){
        if(i+1 != arr[i]){
            var t = i
            while (arr[t] != i+1){
                t++
            }
            var temp = arr[t]
            arr[t] = arr[i]
            arr[i] = temp
            minSwaps++
        }
    }
    return minSwaps
}


