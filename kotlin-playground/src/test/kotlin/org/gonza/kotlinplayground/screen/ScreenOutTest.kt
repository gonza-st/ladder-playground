package org.gonza.kotlinplayground.screen

import org.gonza.kotlinplayground.ladder.Ladder
import org.gonza.kotlinplayground.ladder.Row
import org.gonza.kotlinplayground.player.Player
import org.gonza.kotlinplayground.player.Players
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ScreenOutTest {
    private lateinit var sut: ScreenOut

    @BeforeEach
    fun setUp() {
        sut = ScreenOut()
    }

    @Test
    fun test() {
        val players: Players = TestPlayersImpl(emptyList())
        val ladder: Ladder = TestLadderImpl(emptyList())
        sut.print(players, ladder)
    }
}

class TestLadderImpl(
    override val rows: List<Row>,
) : Ladder

class TestPlayersImpl(
    override val players: List<Player>,
) : Players
