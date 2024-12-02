package com.github.petrole

import com.github.petrole.util.LoadInputAsLines
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class Day2Test : AdventPuzzleTest {

    private lateinit var adventDay: Day2

    @BeforeAll
    override fun setUp() {
        adventDay = Day2(listOf())
    }

    @Test
    override fun part1Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_2.txt"]

        val resultPart1 = adventDay.solvePart1()

        val expectedResult = "2"
        assertThat(resultPart1).isEqualTo(expectedResult)
    }

    @Test
    override fun part2Test() {
        adventDay.inputLines = LoadInputAsLines["test_input_day_2.txt"]

        val resultPart2 = adventDay.solvePart2()

        val expectedResult = "4"
        assertThat(resultPart2).isEqualTo(expectedResult)
    }
}
