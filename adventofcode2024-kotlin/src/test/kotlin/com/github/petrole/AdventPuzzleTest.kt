package com.github.petrole

import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
interface AdventPuzzleTest {
    fun setUp()
    fun part1Test()
    fun part2Test()
}
