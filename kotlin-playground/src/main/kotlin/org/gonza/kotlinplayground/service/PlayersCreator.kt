package org.gonza.kotlinplayground.service

import org.gonza.kotlinplayground.domain.Players

class PlayersCreator {
    fun create(allPlayerName: String): Players = Players(emptyList())

    private fun splitPlayerName(allPlayerName: String): List<String> = allPlayerName.split(",")
}
