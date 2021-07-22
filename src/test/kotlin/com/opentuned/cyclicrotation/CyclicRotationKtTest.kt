package com.opentuned.cyclicrotation

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

internal class CyclicRotationKtTest {

    @Test
    fun `given an array A consisting of N integers and an integer K, returns the array A rotated K times`() {
        assertAll("intArrays can be rotated K times",
            { assertArrayEquals(intArrayOf(0, 0, 0), (solution(intArrayOf(0, 0, 0), 1))) },
            { assertArrayEquals(intArrayOf(), (solution(intArrayOf(), 1))) },
            { assertArrayEquals(intArrayOf(), (solution(intArrayOf(), -1))) },
            { assertArrayEquals(intArrayOf(1, 2, 3, 4), (solution(intArrayOf(1, 2, 3, 4), 4))) },
            { assertArrayEquals(intArrayOf(9, 7, 6, 3, 8), (solution(intArrayOf(3, 8, 9, 7, 6), 3))) },
        )
    }
}