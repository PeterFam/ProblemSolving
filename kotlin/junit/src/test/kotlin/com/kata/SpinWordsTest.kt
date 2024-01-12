package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SpinWordsTest {

   @Test fun `test if string is empty`(){
        assertEquals("", SpinWords().spin(""))
   }

    @Test fun `test if string length entered less than 5`(){
        assertEquals("word", SpinWords().spin("word"))
    }

    @Test fun `test if string length greater than 5`(){
        assertEquals("sdrow", SpinWords().spin("words"))
    }

    @Test fun `test if the string is a sentence`(){
        assertEquals("Hey wollef sroirraw", SpinWords().spin("Hey fellow warriors"))
    }

    @Test fun `test what if the string is integers`(){
        assertEquals("987654321", SpinWords().spin("123456789"))
    }
}