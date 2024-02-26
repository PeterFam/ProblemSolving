package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindNonRepeatedCharTest {

    @Test
    fun `test if we send empty string` (){
        assertEquals(' ', FindNonRepeatedChar().findNonRepeatedChar(""))
    }
    @Test
    fun `test if we send single string` (){
        assertEquals('a', FindNonRepeatedChar().findNonRepeatedChar("apple"))
    }
    @Test
    fun `test if we send long sentence` (){
        assertEquals('g', FindNonRepeatedChar().findNonRepeatedChar("a green apple"))
    }
}