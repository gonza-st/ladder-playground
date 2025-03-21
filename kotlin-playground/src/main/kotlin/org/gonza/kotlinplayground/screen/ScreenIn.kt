package org.gonza.kotlinplayground.screen

import java.util.Scanner

class ScreenIn {
    private val scanner by lazy { Scanner(System.`in`) }

    fun read(): String {
        val text =
            try {
                scanner.nextLine()
            } catch (e: Exception) {
                throw NoSuchElementException("There is no such element.")
            }
        require(text.isNotBlank()) {
            "Input string must not be blank."
        }
        return text
    }

    fun close() {
        scanner.close()
    }
}
