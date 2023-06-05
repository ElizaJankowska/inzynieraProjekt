package com.A1_215IC.inzynieriaprojekt

import org.junit.Test

import org.junit.Assert.*

class testMeTest {

    @Test
    fun `false if greater than 10`() {
        val result = testMe.validateThis(
            n = 12
        )
        assertFalse(result)
    }

    @Test
    fun `false if lower than 2`() {
        val result = testMe.validateThis(
            n = 1
        )
        assertFalse(result)
    }
}