package com.kata

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BookSellerTest {

    @Test
    fun `test if input lists are empty`(){
        assertEquals("", BookSeller.stockSummary(arrayOf(), arrayOf()))
    }

    @Test
    fun `test if input art and books list are fill with data`(){
        assertEquals("",
            BookSeller.stockSummary(arrayOf("XBAR 200", "XDXE 500", "XKWR 250", "XTSQ 890", "XRTY 600"),
                arrayOf("A", "B")))
    }

    fun basicTests(){
        var b = arrayOf("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600")
        var c = arrayOf("A", "B", "C", "D")
        var res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"

        b = arrayOf("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600")
        c = arrayOf("A", "B")
        res = "(A : 200) - (B : 1140)"
    }

}