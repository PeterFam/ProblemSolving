package com.kata

class FindFirstRepeatedChar {

    fun findFirstRepeatedChar(str: String): Char {
        val set: MutableSet<Char> = mutableSetOf()
        str.forEach { c ->
            if (set.contains(c))
                return c
            else
                set.add(c)
        }
        return ' '
    }

}