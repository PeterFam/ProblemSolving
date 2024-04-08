package com.kata

class FindMatrix {

    fun findMatrix(nums: IntArray): List<List<Int>> {
        val matrix : ArrayList<MutableList<Int>> = arrayListOf(nums.toMutableList())



        for(lists in matrix){
            val newList : MutableList<Int> = mutableListOf()
            for(j in lists){
                for(x in 0 until  lists.size - 1){
                    if (j == lists[x + 1]) {
                        newList.add(j)
                    }
                }
            }
            if(newList.isNotEmpty()){
                matrix.add(newList)
            }
        }
        println(matrix.joinToString())
        return matrix
    }

    fun ifArrayContainsElement(arr: MutableList<Int>, num: Int): Boolean{
        if(!arr.contains(num)){
            arr.add(num)
            return true
        }
        return false
    }

}

fun main(){
    FindMatrix().findMatrix(
        intArrayOf(1,3,4,1,2,3,1)
    )
}