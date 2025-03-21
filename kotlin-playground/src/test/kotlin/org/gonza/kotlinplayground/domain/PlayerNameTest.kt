package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PlayerNameTest {
    @ParameterizedTest
    @CsvSource(
        "aaaaa",
        "aaaa",
        "aaa",
        "aa",
        "a"
    )
    fun `참가자의 이름은 5글자 이하이다`(name: String) {
        val playerName = PlayerName(value = name)

        assertThat(playerName).isNotNull
        assertThat(playerName).hasFieldOrProperty("value")
    }

    @ParameterizedTest
    @CsvSource(
        "aaaaaa",
        "aaaaaaaa"
    )
    fun `참가자의 이름은 5글자 초과면 에러가 발생한다`(name: String) {
        Assertions.assertThatThrownBy { PlayerName(value = name) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("이름 길이가 5자 이하여야 합니다.")
    }

    @Test
    fun `참가자의 이름은 1글자 미만이면 에러가 발생한다`() {
        val emptyName = ""
        Assertions.assertThatThrownBy { PlayerName(value = emptyName) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("이름 길이가 1글자 이상이어야 합니다.")
    }

    @Test
    fun `참가자의 이름의 양 옆엔 공백이 있으면, 제거하고 검증한다`() {
        val frontSpaceName = PlayerName(" tri")
        val backSpaceName = PlayerName("tri ")
        val allSpaceName = PlayerName(" tri ")

        val trimmedName = PlayerName("tri")

        assertAll(
            { assertThat(frontSpaceName).isEqualTo(trimmedName) },
            { assertThat(backSpaceName).isEqualTo(trimmedName) },
            { assertThat(allSpaceName).isEqualTo(trimmedName) },
        )
    }
}
