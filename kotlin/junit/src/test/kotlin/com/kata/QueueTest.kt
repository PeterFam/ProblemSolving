package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class QueueTest {

    @Test
   fun `test if we send empty queue`(){
       assertEquals(ArrayDeque(listOf()), Queue().reverseQueue(ArrayDeque(listOf())))
   }
    @Test
    fun `test if we normal queue`(){
        assertEquals(ArrayDeque(listOf(30, 20, 10)), Queue().reverseQueue(ArrayDeque(listOf(10, 20, 30))))
    }
}