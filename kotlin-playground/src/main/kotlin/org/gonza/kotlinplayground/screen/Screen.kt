package org.gonza.kotlinplayground.screen

import org.gonza.kotlinplayground.ladder.LadderCreator
import org.gonza.kotlinplayground.ladder.LadderCreatorImpl
import org.gonza.kotlinplayground.player.LadderGamePlayerCreator
import org.gonza.kotlinplayground.player.PlayerCreator
import org.gonza.kotlinplayground.player.Players

class Screen {
    val ladderCreator: LadderCreator = LadderCreatorImpl()
    val playerCreator: PlayerCreator = LadderGamePlayerCreator()

    fun createPlayer(nameList: List<String>): Players = playerCreator.createPlayersBy(nameList)

    // TODO: Logic
}
