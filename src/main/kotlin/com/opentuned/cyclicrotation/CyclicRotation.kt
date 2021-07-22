package com.opentuned.cyclicrotation

fun solution(A: IntArray, K: Int): IntArray {
    return if(A.size <= K || K < 0 ) A
    else intArrayOf(*A.sliceArray(K-1..A.size-1), *A.sliceArray(0..K-2))
}