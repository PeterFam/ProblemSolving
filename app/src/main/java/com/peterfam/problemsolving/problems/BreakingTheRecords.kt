package com.peterfam.problemsolving.problems

/**
 *  HackerRank Probems "Breaking the Records"
 *  https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 *
 */
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var sumHighScore = 0
    var sumLowestScore = 0
    var highScore = scores.first()
    var lowestScore = scores.first()
    for (i in scores) {
        if (i > highScore) {
            highScore = i
            sumHighScore++
        }
        if (i < lowestScore) {
            lowestScore = i
            lowestScore++
        }
    }
    println("Sum of high Scores   ".plus(sumHighScore))
    println("Sum of lowest Scores   ".plus(sumLowestScore))
    return arrayOf(sumHighScore, sumLowestScore)
}

