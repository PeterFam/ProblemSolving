package com.peterfam.problemsolving.arrays


/**
 *  HackerRank Problems "Arrays: New Year Chaos"
 *  a little bit hard problem
 *  I tried to see some solution as it's tricky
 *  and here its done
 *  https://www.hackerrank.com/challenges/new-year-chaos/problem
 */

fun minimumBribes(q: Array<Int>): Unit {
    var bribe = 0
    var chaotic = false
    var n = q.size

    for (i in 0 until n) {

        if (q[i] - (i + 1) > 2) {
            chaotic = true
            break
        }
       for(j in Math.max(0, q[i]-1-1) until i ){
           if(q[j] > q[i]){
               bribe++
           }
       }
    }
    if(chaotic)
        println("Too chaotic")
    else
        println(bribe)

}
