package com.kata

class RotateArray {
    //https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
    fun rotate(nums: IntArray, k: Int): IntArray {

        for(i in 0 until  k){
            var lastIndex = nums.size - 1
            val temp = nums[lastIndex]
           while (lastIndex > 0){
               nums[lastIndex] = nums[lastIndex - 1]
               lastIndex--
           }
            nums[0] = temp
        }
        println(nums.joinToString())
        return nums
    }


}