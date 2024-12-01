package com.github.petrole

import com.github.petrole.util.LoadInputAsLines
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Day1Test : AdventPuzzleTest {

    private lateinit var adventDay: Day1

    @BeforeAll
    override fun setUp() {
        adventDay = Day1(listOf())
    }

    @Test
    override fun part1Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_1.txt"]

        val resultPart1 = adventDay.solvePart1()

        val expectedResult = "11"
        assertThat(resultPart1).isEqualTo(expectedResult)
    }

    @Test
    override fun part2Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_1.txt"]

        val resultPart2 = adventDay.solvePart2()

        val expectedResult = "31"
        assertThat(resultPart2).isEqualTo(expectedResult)
    }
}
