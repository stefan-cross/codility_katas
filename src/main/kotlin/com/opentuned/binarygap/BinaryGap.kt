package com.opentuned.binarygap

class BinaryGap {
    fun solution(N: Int) : Int {
        return N.toString(2)
            .substringAfter("1", "")
            .substringBeforeLast("1", "")
            .split("1")
            .map { it.length }.maxOrNull() ?: 0
    }
}