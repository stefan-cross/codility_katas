package com.opentuned.cyclicrotation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class CyclicRotationKtTest {

    @Test
    internal fun `given an array A consisting of N integers and an integer K, returns the array A rotated K times`() {
        val A = intArrayOf(3, 8, 9, 7, 6)
        val K = 3
        assertEquals(intArrayOf(9, 7, 6, 3, 8), solution(A, K))
    }
}