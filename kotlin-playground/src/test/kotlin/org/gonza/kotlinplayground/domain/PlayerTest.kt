package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class PlayerTest {
    @Test
    fun `이름은 최대 5글자를 넘을 수 없다`() {
        val exceededName = "123456"

        assertThatThrownBy {
            Player(name = exceededName)
        }.isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `이름은 공백일 수 없다`() {
        val emptyName = ""

        assertThatThrownBy {
            Player(name = emptyName)
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
