package com.opentuned.binarygap

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

internal class BinaryGapTest {

    private val underTest = BinaryGap()

    @Tag("tdd driven test")
    @Test
    internal fun `number 0 case`() { assertEquals(0, underTest.solution(0)) }


    @Tag("tdd driven test")
    @Test
    internal fun `number 1  case`() { assertEquals(0, underTest.solution(1)) }


    @Tag("provided test")
    @Test
    internal fun `number 9 has binary representation 1001 and contains a binary gap of length 2`() {
        assertEquals(2, underTest.solution(9))
    }

    @Tag("provided test")
    @Test
    internal fun `number 529 has binary representation 1000010001 and contains the largest binary gap and has a length 4`() {
        assertEquals(4, underTest.solution(529))
    }

    @Tag("provided test")
    @Test
    internal fun `number 20 has binary representation 10100 and contains one binary gap of length 1`() {
        assertEquals(1, underTest.solution(20))
    }

    @Tag("provided test")
    @Test
    internal fun `number 15 has binary representation 1111 and has no binary gaps`() {
        assertEquals(0, underTest.solution(15))
    }

    @Tag("provided test")
    @Test
    internal fun `number 32 has binary representation 100000 and has no binary gaps`() {
        assertEquals(0, underTest.solution(32))
    }
}