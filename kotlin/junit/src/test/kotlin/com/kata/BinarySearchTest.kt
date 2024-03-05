package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class BinarySearchTest {

    @Test
    fun `test binary search`(){
        assertEquals(4, Search().binarySearch(arrayOf(1, 44, 55, 66, 77, 88), 77))
    }

}