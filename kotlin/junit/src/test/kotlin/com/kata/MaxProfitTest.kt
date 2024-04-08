package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaxProfitTest {

    @Test
    fun `test Max profit testcase`(){
        assertEquals(4, MaxProfit().maxProfit(intArrayOf(1,2,3,4,5)))
    }
}