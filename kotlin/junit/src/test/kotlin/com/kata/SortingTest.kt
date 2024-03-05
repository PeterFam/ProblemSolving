package com.kata


import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SortingTest {

    @Test
    fun `test bubble sorting`(){
        assertArrayEquals(intArrayOf(1,2,2,3,5,6,6), Sorting().bubbleSorting(intArrayOf(1,2,3,2,5,6,6)))
    }


    @Test
    fun `test if bubble sorting with two elements only`(){
        assertArrayEquals(intArrayOf(4,9), Sorting().bubbleSorting(intArrayOf(9, 4)))
    }

    @Test
    fun `test if array is Empty`(){
        assertArrayEquals(intArrayOf(), Sorting().bubbleSorting(intArrayOf()))
    }

    @Test
    fun `what if we have duplicates`(){
        assertArrayEquals(intArrayOf(1, 3, 4, 4, 5, 6, 6, 8, 9), Sorting().bubbleSorting(intArrayOf(9, 4, 6,1, 4,8, 3, 6, 5)))
    }

    @Test
    fun `test insertion sorting`(){
        assertArrayEquals(intArrayOf(1, 3,4, 5, 6, 8, 9), Sorting().insertionSorting(intArrayOf(9, 4, 6,1, 8, 3, 5)))
    }


    @Test
    fun `test if insertion sorting with two elements only`(){
        assertArrayEquals(intArrayOf(4,9), Sorting().insertionSorting(intArrayOf(9, 4)))
    }

    @Test
    fun `test if insertion sorting array is Empty`(){
        assertArrayEquals(intArrayOf(), Sorting().insertionSorting(intArrayOf()))
    }

    @Test
    fun `what if we have duplicates in insertion sorting`(){
        assertArrayEquals(intArrayOf(1, 3, 4, 4, 5, 6, 6, 8, 9), Sorting().insertionSorting(intArrayOf(9, 4, 6,1, 4,8, 3, 6, 5)))
    }

    @Test
    fun `test merge sorting`(){
        assertArrayEquals(intArrayOf(1, 3,4, 5, 6, 8, 9), Sorting().mergeSorting(intArrayOf(9, 4, 6,1, 8, 3, 5)))
    }


    @Test
    fun `test if merge sorting with two elements only`(){
        assertArrayEquals(intArrayOf(4,9), Sorting().mergeSorting(intArrayOf(9, 4)))
    }

    @Test
    fun `test if merge sorting array is Empty`(){
        assertArrayEquals(intArrayOf(), Sorting().mergeSorting(intArrayOf()))
    }

    @Test
    fun `what if we have duplicates in merge sorting`(){
        assertArrayEquals(intArrayOf(1, 3, 4, 4, 5, 6, 6, 8, 9), Sorting().mergeSorting(intArrayOf(9, 4, 6,1, 4,8, 3, 6, 5)))
    }

}