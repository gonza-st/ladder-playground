package org.gonza.kotlinplayground.domain

import org.junit.jupiter.api.Test

class RowTest {
    @Test
    fun `Row는 Point의 일급 객체이다`() {
        val pointList = listOf(Point(1, 1))
        val playerCount = 3
        val depth = 0

        val row = Row(pointList, playerCount, depth)
    }
}
