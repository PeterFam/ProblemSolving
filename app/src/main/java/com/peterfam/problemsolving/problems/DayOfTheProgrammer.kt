package com.peterfam.problemsolving.problems

/**
 *  HackerRank Problems "Day of the Programmer"
 *  https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 *
 */
fun dayOfProgrammer(year: Int): String {
    val day  = if (year < 1918) {
        if (year.rem(4) == 0) {
            12
        } else {
            13
        }
    } else if (year == 1918) {
        26
    } else {
        if ((year.rem(400) == 0) || (year.rem(4) == 0 && year.rem(100) != 0)) {
            12
        } else {
            13
        }
    }
    return "$day.9.$year"
}
