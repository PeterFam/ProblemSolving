package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindFirstRepeatedCharTest {

    @Test
    fun `test if we send empty string` (){
        assertEquals(' ', FindFirstRepeatedChar().findFirstRepeatedChar(""))
    }
    @Test
    fun `test if we send single string` (){
        assertEquals('p', FindFirstRepeatedChar().findFirstRepeatedChar("apple"))
    }
    @Test
    fun `test if we send long sentence` (){
        assertEquals('e', FindFirstRepeatedChar().findFirstRepeatedChar("green apple"))
    }

}