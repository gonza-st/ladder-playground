package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions.*
import org.gonza.kotlinplayground.domain.exception.DomainException
import org.junit.jupiter.api.Test

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
}
