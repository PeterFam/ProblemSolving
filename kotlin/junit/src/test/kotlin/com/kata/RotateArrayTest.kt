package com.kata

import org.junit.Assert.assertArrayEquals
import kotlin.test.Test

class RotateArrayTest {

    @Test
    fun `test rotate array use case 1`(){
        assertArrayEquals(intArrayOf(5,6,7,1,2,3,4), RotateArray().rotate(intArrayOf(1,2,3,4,5,6,7), 3))
    }

    @Test
    fun `test rotate array use case 2`(){
        assertArrayEquals(intArrayOf(3,99,-1,-100), RotateArray().rotate(intArrayOf(-1,-100,3,99), 2))
    }

    @Test
    fun `test rotate array use case 3`(){
        assertArrayEquals(intArrayOf(1), RotateArray().rotate(intArrayOf(1), 1))
    }

    @Test
    fun `test rotate array use case 4`(){
        assertArrayEquals(intArrayOf(-1), RotateArray().rotate(intArrayOf(-1), 2))
    }

    @Test
    fun `test rotate array use case 5`(){
        assertArrayEquals(intArrayOf(2,1), RotateArray().rotate(intArrayOf(1,2), 3))
    }

}