package com.github.petrole

import com.github.petrole.util.LoadInputAsLines
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Day4Test : AdventPuzzleTest {

    private lateinit var adventDay: Day4

    @BeforeAll
    override fun setUp() {
        adventDay = Day4(listOf())
    }

    @Test
    override fun part1Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_4.txt"]

        val resultPart1 = adventDay.solvePart1()

        val expectedResult = "18"
        assertThat(resultPart1).isEqualTo(expectedResult)
    }

    @Test
    override fun part2Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_4.txt"]

        val resultPart2 = adventDay.solvePart2()

        val expectedResult = "48"
        assertThat(resultPart2).isEqualTo(expectedResult)
    }
}
