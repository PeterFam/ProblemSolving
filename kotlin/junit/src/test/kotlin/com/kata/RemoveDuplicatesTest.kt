package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicatesTest {


    @Test
    fun `test remove duplicates problem`(){
        assertEquals(7,RemoveDuplicates().removeDuplicates(arrayListOf(0,0,1,1,1,1,2,3,3)) )
    }
}