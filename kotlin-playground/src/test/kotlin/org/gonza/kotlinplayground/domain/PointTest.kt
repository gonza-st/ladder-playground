package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PointTest {
    @Test
    fun `x, y 값을 가진다`() {
        val xValue = 1
        val yValue = 2

        val point = Point(x = xValue, y = yValue)

        assertThat(point).isNotNull
        assertThat(point).hasFieldOrProperty("x")
        assertThat(point).hasFieldOrProperty("y")
    }

    @ParameterizedTest
    @CsvSource(
        "0, 0",
        "10, 10",
        "20, 20",
        "1, 1000",
        "10000, 1000000",
    )
    fun `Point의 x,y는 0이상의 정수이다`(
        x: Int,
        y: Int,
    ) {
        val point = Point(x = x, y = y)

        assertThat(point).isNotNull
        assertThat(point).hasFieldOrProperty("x")
        assertThat(point).hasFieldOrProperty("y")
    }

    @ParameterizedTest
    @CsvSource(
        "-1, 0",
        "0, -1",
        "-1, -1",
        "1, -1",
    )
    fun `Point의 x,y에 음수가 들어가면 에러가 발생한다`(
        x: Int,
        y: Int,
    ) {
        Assertions
            .assertThatThrownBy { Point(x = x, y = y) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("올바른 값이 아닙니다")
    }
}
