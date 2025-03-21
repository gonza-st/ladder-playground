package org.gonza.kotlinplayground.player

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class LadderGamePlayersTest {
    @Test
    fun `Player의 리스트를 사용해서 인스턴스화한다`() {
        val players = listOf(LadderGamePlayer("1", 0), LadderGamePlayer("2", 1))
        assertDoesNotThrow {
            LadderGamePlayers(players)
        }
    }
}