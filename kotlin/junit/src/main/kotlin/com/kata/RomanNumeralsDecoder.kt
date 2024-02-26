package com.kata

class RomanNumeralsDecoder {
    private val romansNumbers = mapOf('M' to 1000, 'D' to 500, 'C' to 100,'L' to 50,
        'X' to 10,'V' to 5, 'I' to 1).toMutableMap()
    fun decode(str: String): Int {
        if (str.isEmpty()) return 0
        var n = 0
        var last = 'O'
        for (c in str) {
            when (c) {
                'I' -> n += 1
                'V' -> n += if (last == 'I') 3 else 5
                'X' -> n += if (last == 'I') 8 else 10
                'L' -> n += if (last == 'X') 30 else 50
                'C' -> n += if (last == 'X') 80 else 100
                'D' -> n += if (last == 'C') 300 else 500
                'M' -> n += if (last == 'C') 800 else 1000
            }
            last = c
        }
        return n
    }
}