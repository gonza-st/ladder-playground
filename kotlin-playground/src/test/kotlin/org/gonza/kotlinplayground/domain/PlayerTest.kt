package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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
