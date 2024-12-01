package com.github.petrole.util

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import com.google.common.truth.Truth.assertThat
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UtilsTest {

    private val filename = "utils_test_file.txt"

    @Test
    fun testLoadInputAsLines() {
        val testFileName = filename

        val result = LoadInputAsLines[testFileName]

        val expectedResult = listOf("YOLO", "420")
        assertThat(result).isEqualTo(expectedResult)
    }

    @Test
    fun testLoadInputAsText() {
        val testFileName = filename

        val result = LoadInputAsText[testFileName]

        val expectedResult = "YOLO\n" + "420\n"
        assertThat(result).isEqualTo(expectedResult)
    }
}
