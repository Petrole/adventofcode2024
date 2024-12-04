package com.github.petrole


/**
 * Problem description @ [https://adventofcode.com/2024/day/1](https://adventofcode.com/2024/day/3)
 */
class Day3(
    /**
     * Input lines coming from the puzzle entry.
     */
    var inputLines: List<String>
) : AdventPuzzle {

    override val puzzleName = "Day 3: Mull It Over "

    override fun solvePart1(): String {
        var total = 0
        val multiplyRegex = """mul\((\d+),(\d+)\)""".toRegex()

        for (line in inputLines) {
            total += multiplyRegex
                .findAll(line)
                .sumOf { match -> match.groupValues[1].toInt() * match.groupValues[2].toInt() }
        }
        return total.toString()
    }


    override fun solvePart2(): String {
        var total = 0
        val multiplyRegex = """mul\((\d+),(\d+)\)""".toRegex()
        var enabled = true
        val doDontRegex = """(do\(\)|don't\(\))""".toRegex()


        for (line in inputLines) {
            val matches = doDontRegex.findAll(line) + multiplyRegex.findAll(line)
            matches.sortedBy { it.range.first }.forEach { match ->
                when (match.value) {
                    "do()" -> enabled = true
                    "don't()" -> enabled = false
                    else -> if (enabled && match.groupValues.size > 2) {
                        total += match.groupValues[1].toInt() * match.groupValues[2].toInt()
                    }
                }
            }
        }
        return total.toString()
    }
}
