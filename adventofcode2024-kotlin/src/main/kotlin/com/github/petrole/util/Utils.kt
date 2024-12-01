package com.github.petrole.util

import java.io.IOException
import java.io.InputStream
import java.lang.invoke.MethodHandles


/**
 * Various utility singletons and methods used for the advent of code puzzles.
 */
fun String.getMatchingResourceAsStream(): InputStream {
    return MethodHandles.lookup().lookupClass().classLoader.getResourceAsStream(this)
        ?: throw IOException("Cannot find file : please check the path, file status or classpath settings.")
}

object LoadInputAsLines {
    /**
     * Retrieves all lines of a file as a list. Use UTF-8.
     */
    operator fun get(name: String): List<String> {
        return name.getMatchingResourceAsStream().bufferedReader(Charsets.UTF_8).readLines()
    }
}

object LoadInputAsText {
    /**
     * Retrieves all the content of a file as a string. Use UTF-8.
     */
    operator fun get(name: String): String {
        return name.getMatchingResourceAsStream().bufferedReader(Charsets.UTF_8).use { it.readText() }
    }
}
