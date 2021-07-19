package com.opentuned.binarygap

class BinaryGap {
    fun solution(N: Int) : Int {
        return N.toString(2).substringAfter("1").substringBefore("1").length
    }
}