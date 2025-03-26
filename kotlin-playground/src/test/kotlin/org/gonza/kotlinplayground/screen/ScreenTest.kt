package org.gonza.kotlinplayground.screen

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ScreenTest {
    private val sut: Screen = Screen()

    @Test
    fun creatablePlayer() {
        val actual = sut.createPlayer(listOf("A"))

        assertThat(actual.players.size).isEqualTo(1)
    }
}
