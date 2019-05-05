package com.peterfam.problemsolving.problems

/**
 *  HackerRank Problems "Bon Appétit"
 *  https://www.hackerrank.com/challenges/bon-appetit/problem
 *
 */
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var annSum = 0
    for (i in bill.indices) {
        if(i != k){
            annSum += bill[i]

        }
    }

    if (b - (annSum/2) == 0) {
        println("Bon Appetit")
    } else if (b - (annSum/2) > 0) {
        print(b - (annSum/2))
    }
}