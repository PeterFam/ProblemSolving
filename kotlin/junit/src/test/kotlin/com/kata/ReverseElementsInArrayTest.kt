package com.kata

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ReverseElementsInArrayTest {

    @Test
    fun `reverse integers in elements`(){
        assertArrayEquals( intArrayOf(5, 6, 1, 4), ReverseElementsInArray.reverseArray(4165))
    }

}