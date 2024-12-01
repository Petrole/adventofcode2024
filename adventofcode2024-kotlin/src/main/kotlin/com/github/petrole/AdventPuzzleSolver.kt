@file:Suppress("unused")

package com.github.petrole

import com.github.petrole.util.LoadInputAsLines
import org.reflections.Reflections

/**
 * Use [Reflections] to scan implementations of the [AdventPuzzle] interface and run their solving functions.
 */
object AdventPuzzleSolver {

    private val reflections = Reflections("com.github.petrole")

    private fun getAllAdventPuzzleImplInterfaces(): MutableSet<Class<out AdventPuzzle>> {
        return reflections.getSubTypesOf(AdventPuzzle::class.java)
            ?: throw NoSuchElementException("Couldn't find day classes - please check directory .")
    }

    private fun inputDay(day: Int): String {
        return "input_day_${day}.txt"
    }

    private fun Class<out AdventPuzzle>.getNewInstanceOf(day: Int): AdventPuzzle {
        return this.constructors[0].newInstance(LoadInputAsLines[inputDay(day)]) as AdventPuzzle
    }

    private fun getSpecificDay(day: Int): AdventPuzzle {
        return getAllAdventPuzzleImplInterfaces()
            .first { it.simpleName.contains(day.toString()) }
            .getNewInstanceOf(day)
    }

    fun solveAllDays() {
        getAllAdventPuzzleImplInterfaces()
            .forEachIndexed { dayIndex, clazz ->
                clazz.getNewInstanceOf(dayIndex + 1)
                    .run {
                        println("${this::class.simpleName}: ${this.puzzleName}.")
                        solvePart1Timed()
                        solvePart2Timed()
                    }
            }
    }

    fun solveDay(day: Int) {
        getSpecificDay(day).run {
            println("${this::class.simpleName}: ${this.puzzleName}.")
            solvePart1Timed()
            solvePart2Timed()
        }
    }

    fun solveDayPart1(day: Int) {
        getSpecificDay(day).run {
            println("${this::class.simpleName}: ${this.puzzleName}.")
            solvePart1Timed()
        }
    }

    fun solveDayPart2(day: Int) {
        getSpecificDay(day).run {
            println("${this::class.simpleName}: ${this.puzzleName}.")
            solvePart2Timed()
        }
    }
}



