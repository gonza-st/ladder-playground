package org.gonza.kotlinplayground.screen

import org.gonza.kotlinplayground.ladder.LadderCreator
import org.gonza.kotlinplayground.ladder.LadderCreatorImpl
import org.gonza.kotlinplayground.player.LadderGamePlayerCreator
import org.gonza.kotlinplayground.player.PlayerCreator

class Screen {
    val ladderCreator: LadderCreator = LadderCreatorImpl()
    val playerCreator: PlayerCreator = LadderGamePlayerCreator()

    // TODO: Logic
}
