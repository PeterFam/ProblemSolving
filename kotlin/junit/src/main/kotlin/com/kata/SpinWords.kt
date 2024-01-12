package com.kata

class SpinWords {

    fun spin(words: String): String{
        val stringArray = words.split(" ").toTypedArray()
        stringArray.forEachIndexed{ i, value ->
            if(value.length >= 5){
                stringArray[i] = value.reversed()
            }
        }
    return stringArray.joinToString(" ")
    }
}