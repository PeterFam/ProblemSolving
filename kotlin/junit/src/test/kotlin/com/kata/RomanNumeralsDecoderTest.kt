package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RomanNumeralsDecoderTest {
    
    @Test
    fun `test if roman number is empty should return zero`(){
        assertEquals(0, RomanNumeralsDecoder().decode("333"))
    }

    @Test
    fun `test if roman number is from 1 to 5`(){
        assertEquals(4, RomanNumeralsDecoder().decode("IIII"))
    }
    @Test
    fun `test if roman number is equals 5`(){
        assertEquals(5, RomanNumeralsDecoder().decode("V"))
    }
    @Test
    fun `test if roman number is greater than 5 and smaller than 9`(){
        assertEquals(7, RomanNumeralsDecoder().decode("VII"))
    }
    @Test
    fun `test if roman numbers is greater than 10`(){
        assertEquals(1935, RomanNumeralsDecoder().decode("MCMXXXV"))
    }
}