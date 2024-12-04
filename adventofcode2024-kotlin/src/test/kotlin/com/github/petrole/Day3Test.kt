package com.github.petrole

import com.github.petrole.util.LoadInputAsLines
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Day3Test : AdventPuzzleTest {

    private lateinit var adventDay: Day3

    @BeforeAll
    override fun setUp() {
        adventDay = Day3(listOf())
    }

    @Test
    override fun part1Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_3_1.txt"]

        val resultPart1 = adventDay.solvePart1()

        val expectedResult = "161"
        assertThat(resultPart1).isEqualTo(expectedResult)
    }

    @Test
    override fun part2Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_3_2.txt"]

        val resultPart2 = adventDay.solvePart2()

        val expectedResult = "48"
        assertThat(resultPart2).isEqualTo(expectedResult)
    }
}
