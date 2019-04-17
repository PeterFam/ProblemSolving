package com.peterfam.problemsolving.arrays
/**
 *  HackerRank Problems "Arrays: Left Rotation"
 *  this type of question for interview question
 *  I get around some solutions but this solution I think the easiest
 *  may be not the simplest.
 *  https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 */

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    var rotArray:Array<Int> = Array(a.size) { i -> (i)}
    var size = a.size
    var scope = 0

    for(i in 0 until size){
        if(d+i < size){
            rotArray[i] = a[d+i]
        }else{
            rotArray[i] = a[scope]
            scope++
        }
    }

    return rotArray
}