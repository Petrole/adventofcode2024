package com.github.petrole


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
        adventDay.inputLines = listOf("A", "B", "C")

        val resultPart1 = adventDay.solvePart1()

        val expectedResult = "No solution found."
        assertThat(resultPart1).isEqualTo(expectedResult)
    }

    @Test
    override fun part2Test() {
        adventDay.inputLines = listOf("1", "2", "3")

        val resultPart2 = adventDay.solvePart2()

        val expectedResult = "No solution found."
        assertThat(resultPart2).isEqualTo(expectedResult)
    }
}
