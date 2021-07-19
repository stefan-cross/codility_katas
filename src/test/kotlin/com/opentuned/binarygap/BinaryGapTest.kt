package com.opentuned.binarygap

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinaryGapTest {

    @Test
    internal fun `number 9 has binary representation 1001 and contains a binary gap of length 2`() {
        assertEquals(2, BinaryGap().solution(9))
    }

    @Test
    internal fun `number 529 has binary representation 1000010001 and contains the largest binary gap and has a length 4`() {
        assertEquals(4, BinaryGap().solution(529))
    }

    @Test
    internal fun `number 20 has binary representation 10100 and contains one binary gap of length 1`() {
        assertEquals(1, BinaryGap().solution(20))
    }

    @Test
    internal fun `number 15 has binary representation 1111 and has no binary gaps`() {
        assertEquals(0, BinaryGap().solution(15))
    }

    @Test
    internal fun `number 32 has binary representation 100000 and has no binary gaps`() {
        assertEquals(0, BinaryGap().solution(32))
    }
}