package com.kata

class BookSeller {
    companion object {
        fun stockSummary(lstOfArt: Array<String>, lstOfCat: Array<String>): String {
//            if (lstOfArt.isEmpty()) {
//                return ""
//            }
//            val resultList = lstOfCat.associateWith { 0 }.toMutableMap()
//            var res = ""
//
//            lstOfArt.forEach {
//                if(resultList.containsKey(it.first().toString())){
//                    resultList[it.first().toString()] =
//                        resultList[it.first().toString()]!!.plus(it.split(" ").last().toInt())
//                }
//            }
//            resultList.forEach { (rk, v) ->
//                res += "($rk : $v) - "
//            }
//
//            return res.dropLast(3)
            if (lstOfArt.isEmpty()) return ""
            val counts = lstOfArt.groupingBy { it.take(1) }.fold(0) { acc, s -> acc + s.split(" ")[1].toInt() }
            return lstOfCat.joinToString(" - ") { "($it : ${counts.getOrDefault(it, 0)})" }
        }
    }
}