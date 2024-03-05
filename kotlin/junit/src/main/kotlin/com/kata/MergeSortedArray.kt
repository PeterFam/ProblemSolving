package com.kata


/**
 * https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 */
class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {

        for(i in nums2.indices)
            nums1[i + m] = nums2[i]


        for(i in nums1.indices){
           for(j in 0 until  nums1.size -1){
               if(nums1[j] > nums1[j + 1]){
                   val temp = nums1[j]
                   nums1[j] = nums1[j + 1]
                   nums1[j + 1] = temp
               }
           }
        }
        return nums1
    }

}