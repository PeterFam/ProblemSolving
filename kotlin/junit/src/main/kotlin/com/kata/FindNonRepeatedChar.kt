package com.kata

class FindNonRepeatedChar {

    fun findNonRepeatedChar(text: String): Char{
        val map: MutableMap<Char, Int> = mutableMapOf()
        text.trim().forEach {  c ->
            val count = if(map.containsKey(c)) map[c] else 0
            map[c] = count!! + 1
        }
        map.forEach{ (char, i) ->
            if(i == 1){
                return char
            }
        }
        return ' '
    }

}