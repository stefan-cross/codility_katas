package com.opentuned.cyclicrotation

fun solution(A: IntArray, K: Int): IntArray {
    return intArrayOf(*A.sliceArray(K-1..A.size-1), *A.sliceArray(0..K-2))
}