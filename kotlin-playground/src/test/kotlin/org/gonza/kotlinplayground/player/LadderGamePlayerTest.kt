package org.gonza.kotlinplayground.player

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class LadderGamePlayerTest {
    @Test
    fun `플레이어 이름이 5글자 일 수 있다`() {
        val fiveLengthName = "a".repeat(5);

        assertDoesNotThrow {
            LadderGamePlayer(fiveLengthName, 1)
        }
    }

    @Test
    fun `플레이어 이름은 5글자 이하이어야한다`() {
        val sixLengthName = "a".repeat(6);

        val ex = assertThrows<IllegalArgumentException> {
            LadderGamePlayer(sixLengthName, 1)
        }

        assertEquals(ex.message, "이름은 5글자이하만 가능합니다.")
    }

    @Test
    fun `플레이어의 이름은 공백일 수 없다`() {
        val emptyName = " ";
        val ex = assertThrows<IllegalArgumentException> {
            LadderGamePlayer(emptyName, 1)
        }

        assertEquals(ex.message, "이름에 공백 문자열만 사용할 수 없습니다.")
    }

    @Test
    fun `플레이어의 위치는 0보다 작을 수 없다`() {
        val negativePosition = -1;
        val ex = assertThrows<IllegalArgumentException> {
            LadderGamePlayer("name", negativePosition)
        }

        assertEquals(ex.message, "position이 음수일 수 없습니다.")
    }
}