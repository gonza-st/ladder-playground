package org.gonza.kotlinplayground.domain

data class Point(
    val x: Int,
    val y: Int,
) {
    companion object {
        private const val MIN_VALUE = 0
    }

    init {
        require (x >= MIN_VALUE && y >= MIN_VALUE) {
            throw IllegalArgumentException("올바른 값이 아닙니다")
        }
    }
}
