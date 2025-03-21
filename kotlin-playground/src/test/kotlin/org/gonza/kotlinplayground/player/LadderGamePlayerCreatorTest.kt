package org.gonza.kotlinplayground.player

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class LadderGamePlayerCreatorTest {
    private val sut by lazy { LadderGamePlayerCreator() }

    @Test
    fun `빈 이름 목록이 주어지는 경우 예외를 던진다`() {
        val emptyNameList = emptyList<String>()
        val ex = assertThrows<IllegalArgumentException> {
            sut.createPlayersBy(emptyNameList)
        }

        assertEquals(ex.message, "이름의 목록은 비어있을 수 없습니다.")
    }

    @Test
    fun `주어진 이름의 숫자만큼 플레이어를 생성한다`() {
        val names = listOf("name1", "name2")
        val players = sut.createPlayersBy(names)

        assertEquals(names.size, players.players.size)
    }
}