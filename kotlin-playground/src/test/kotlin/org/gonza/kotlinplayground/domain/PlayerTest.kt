package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
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

    @ParameterizedTest
    @CsvSource(
        "aaaaa",
        "aaaa",
        "aaa",
        "aa",
        "a"
    )
    fun `참가자의 이름은 5글자 이하이다`(name: String) {
        val position = Point(x = 0, y = 0)

        val player = Player(name = name, position = position)

        assertThat(player).isNotNull
        assertThat(player).hasFieldOrProperty("name")
        assertThat(player).hasFieldOrProperty("position")
    }

    @ParameterizedTest
    @CsvSource(
        "aaaaaa",
        "aaaaaaaa"
    )
    fun `참가자의 이름은 5글자 초과면 에러가 발생한다`(name: String) {
        val position = Point(x = 0, y = 0)

        Assertions.assertThatThrownBy { Player(name = name, position = position) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("이름 길이가 5자 이하여야 합니다.")
    }

    @Test
    fun `참가자의 이름은 1글자 미만이면 에러가 발생한다`() {
        val emptyName = ""
        val position = Point(x = 0, y = 0)

        Assertions.assertThatThrownBy { Player(name = emptyName, position = position) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("이름 길이가 1글자 이상이어야 합니다.")
    }

    @ParameterizedTest
    @CsvSource(
        value = [
            " trim ",
            " trim",
            "trim ",
        ],
        ignoreLeadingAndTrailingWhiteSpace = false
    )
    fun `참가자의 이름의 양 옆엔 공백이 있으면, 제거하고 검증한다`(name: String) {
        val position = Point(x = 0, y = 0)

        val trimmedName = "trim"

        val player = Player(name = name, position = position)
        val player2 = Player(name = trimmedName, position = position)

        println("player = '${player.name}'")
        println("player2 = '${player2.name}'")
        assertThat(player).isEqualTo(player2)
    }
}
