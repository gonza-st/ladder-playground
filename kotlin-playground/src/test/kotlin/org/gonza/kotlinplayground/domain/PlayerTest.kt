package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PlayerTest {

    @Test
    fun `참가자는 이름과 위치를 가진다`() {
        val name = "test"
        val position = Point(x = 0, y = 0)

        val player = Player(name = name, position = position)

        assertThat(player).isNotNull
        assertThat(player).hasFieldOrProperty("name")
        assertThat(player).hasFieldOrProperty("position")
    }

}
