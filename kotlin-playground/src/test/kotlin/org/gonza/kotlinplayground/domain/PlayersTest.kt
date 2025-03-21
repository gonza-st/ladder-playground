package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions.*
import org.gonza.kotlinplayground.domain.exception.DomainException
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PlayersTest {
    @Test
    fun `유저목록이 비어있다면 생성할 수 없다`() {
        val emptyList = emptyList<Player>()

        assertThatThrownBy {
            Players(
                playerList = emptyList,
            )
        }.isInstanceOf(DomainException.EmptyPlayerListException::class.java)
    }

    @Test
    fun `유저이름목록을 조회할 수 있다`() {
        val playerList =
            listOf(
                Player("a"),
                Player("b"),
                Player("c"),
            )
        val players = Players(playerList = playerList)

        val nameList = players.getNameList()

        assertThat(nameList).hasSize(3)
        assertEquals(nameList[0], playerList[0].name)
        assertEquals(nameList[1], playerList[1].name)
        assertEquals(nameList[2], playerList[2].name)
    }
}
