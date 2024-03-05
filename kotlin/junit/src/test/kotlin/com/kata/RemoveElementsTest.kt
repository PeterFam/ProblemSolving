package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveElementsTest {

    @Test
    fun `test remove elements function`(){
        assertEquals(3, RemoveElements().removeElement(intArrayOf(2,2,3), 2))
    }

}