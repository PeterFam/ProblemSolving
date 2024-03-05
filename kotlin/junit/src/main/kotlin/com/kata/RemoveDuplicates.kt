package com.kata

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150
 */
class RemoveDuplicates {
    //
    fun removeDuplicates(nums: ArrayList<Int>): Int {
        var j = 0
        var num = nums[0]  // nums.length >= 1
        var count = 0

        for (i in nums.indices) {
            if (num == nums[i]) { // repeated number
                count++
                if (count <= 2) nums[j++] = num
            } else { // new number
                num = nums[i]
                nums[j++] = num
                count = 1
            }
        }
        println(nums.joinToString())
        return j
    }
}