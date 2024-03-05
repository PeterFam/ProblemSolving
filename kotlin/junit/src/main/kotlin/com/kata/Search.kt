package com.kata

class Search {

    fun binarySearch(arr: Array<Int>,target: Int): Int{
           return binarySearchImp(arr, target, 0, arr.size-1)
    }
   private fun binarySearchImp(arr: Array<Int>, target: Int, left: Int, right: Int): Int {

        if(right < left)
            return -1

        val middle = (left + right)/2

        if(arr[middle] == target)
            return middle

        if(target < arr[middle] )
            return binarySearchImp(arr, target, left, middle-1)

        return binarySearchImp(arr, target, middle+1, right)
    }

}