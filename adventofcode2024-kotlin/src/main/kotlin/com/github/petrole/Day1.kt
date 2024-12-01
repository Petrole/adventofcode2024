package com.github.petrole

import kotlin.math.abs


/**
 * Problem description @ [https://adventofcode.com/2024/day/1](https://adventofcode.com/2024/day/1)
 */
class Day1(
    /**
     * Input lines coming from the puzzle entry.
     */
    var inputLines: List<String>
) : AdventPuzzle {

    override val puzzleName = "Day1"

    val listA = mutableListOf<Int>()
    val listB = mutableListOf<Int>()

    private fun sanitizeInput() {
        for (line in inputLines) {
            line.trim()
                .split("\\s+".toRegex())
                .map { it.toInt() }
                .let { pair -> listA.add(pair[0]); listB.add(pair[1]) }
        }
    }

    override fun solvePart1(): String {
        sanitizeInput()

        listA.sort()
        listB.sort()

        var total = 0

        for (i in listA.indices) {
            total += abs(listA[i] - listB[i])
        }

        return total.toString()
    }

    override fun solvePart2(): String {
        sanitizeInput()

        var similarityScore = 0
        for (number in listA) {
            similarityScore += number * listB.count { it == number }
        }

        return similarityScore.toString()
    }
}
