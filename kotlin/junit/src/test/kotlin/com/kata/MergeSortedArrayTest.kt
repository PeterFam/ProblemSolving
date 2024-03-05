package com.kata

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MergeSortedArrayTest {

    @Test
    fun `test normal case`(){
        assertArrayEquals(intArrayOf(1,2,2,3,5,6,6), MergeSortedArray().merge(intArrayOf(1,2,3,0,0,0,0),3, intArrayOf(2, 5, 6, 6), 4 ))
    }

}