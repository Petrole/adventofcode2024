package com.github.petrole

import kotlin.time.measureTimedValue


interface AdventPuzzle {

    companion object {
        /**
         * String to use when appropriate AND when no solution is found.
         */
        const val NO_SOLUTION_FOUND: String = "No solution found."
    }

    val puzzleName: String

    fun solvePart1(): String
    fun solvePart2(): String

    fun solvePart1Timed() {
        println("Part1 result: ${measureTimedValue { this.solvePart1() }}")
    }

    fun solvePart2Timed() {
        println("Part2 result: ${measureTimedValue { this.solvePart2() }}\n")
    }
}