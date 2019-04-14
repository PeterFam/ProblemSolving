package com.peterfam.problemsolving.problems

/**
 *  HackerRank Problems "Birthday Cake Candles"
 *  https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 *
 */
fun birthdayCakeCandles(ar: Array<Int>): Int {
    var sumOfCandles = 0
    var max = ar.max()
    for(i in ar){
        if(max == i){
            sumOfCandles++
        }
    }
    return sumOfCandles
}