package com.kata

class Sorting {

    fun bubbleSorting(array: IntArray): IntArray {
        val n = array.size
        for(i in 0 until  n){
            for(j in 0 until  n - 1){
                if(array[j] > array[j + 1]){
                    val temp = array[j]
                    array[j] = array[j+1]
                    array[j+1] = temp
                }
            }
        }
        return array
    }

    fun insertionSorting(arr: IntArray): IntArray{
        for(i in 1 until arr.size){
            val current = arr[i]
            var j = i - 1
            while (j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j]
                j--
            }
            arr[j + 1] = current
        }
        return arr
    }

    fun mergeSorting(array: IntArray): IntArray{
        //split
        //sort
        //merge

        if(array.size < 2)
            return array

        val middle  = array.size/2

        val left = IntArray(middle)
        for(i in 0 until middle)
            left[i] = array[i]

        val right = IntArray(array.size - middle)
        for(j in middle until  array.size)
            right[j - middle] = array[j]

        mergeSorting(left)
        mergeSorting(right)

        return mergeTwoList(left, right, array)
    }

    private fun mergeTwoList(left: IntArray, right: IntArray, result: IntArray): IntArray{
        var i = 0
        var j = 0
        var k = 0

        while (i < left.size && j < right.size){
         if(left[i] <= right[j]){
            result[k++] = left[i++]
         }else{
             result[k++] = right[j++]
         }
        }
        while (i < left.size)
            result[k++] = left[i++]

        while (j < right.size)
            result[k++] = right[j++]

        return result
    }

}