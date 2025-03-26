package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RowTest {
    @Test
    fun `Row는 Point의 일급 객체이다`() {
        val pointList = listOf(Point(1, 1))
        val playerCount = 3
        val depth = 4

        val row = Row(playerCount = playerCount, depth = depth)

        Assertions.assertThat(row.size()).isEqualTo(playerCount)
    }
}
