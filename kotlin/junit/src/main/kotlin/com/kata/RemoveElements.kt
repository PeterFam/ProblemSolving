package com.kata

/**
 * https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 */
class RemoveElements {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0

        for (i in nums.indices){
            if(nums[i]!=`val`){
                nums[k]=nums[i]
                k++
            }
        }
        return k
    }

}