package com.github.petrole


/**
 * Problem description @ [https://adventofcode.com/2024/day/1](https://adventofcode.com/2024/day/2)
 */
class Day2(
    /**
     * Input lines coming from the puzzle entry.
     */
    var inputLines: List<String>
) : AdventPuzzle {

    override val puzzleName = "Day 2: Red-Nosed Reports"

    private fun isValidList(sublist: List<Int>): Boolean {
        if (sublist.size < 2) return true // A single element or empty list is trivially valid

        val differences = sublist.zipWithNext { a, b -> b - a }
        val isIncreasing = differences.all { it in 1..3 }
        val isDecreasing = differences.all { it in -3..-1 }

        return isIncreasing || isDecreasing
    }

    private fun canBeValidByRemovingOneLevel(sublist: List<Int>): Boolean {
        if (sublist.size < 3)
            return false
        return sublist.indices.any { index ->
            val modifiedList = sublist.toMutableList().apply { removeAt(index) }
            isValidList(modifiedList)
        }
    }

    override fun solvePart1(): String {
        return inputLines
            .map { line -> line.trim().split("\\s+".toRegex()).map { it.toInt() } }
            .filter { isValidList(it) }.size.toString()
    }

    override fun solvePart2(): String {
        return inputLines
            .map { line -> line.trim().split("\\s+".toRegex()).map { it.toInt() } }
            .filter { isValidList(it) || canBeValidByRemovingOneLevel(it) }.size.toString()
    }
}
