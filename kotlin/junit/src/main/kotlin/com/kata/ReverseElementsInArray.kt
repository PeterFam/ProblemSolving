package com.kata

class ReverseElementsInArray {
    companion object {
        fun reverseArray(n: Long): IntArray {
            return n.toString().reversed().map { it.digitToInt() }.toIntArray()
        }
    }
}