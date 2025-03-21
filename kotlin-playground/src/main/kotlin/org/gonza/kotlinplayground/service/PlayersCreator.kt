package org.gonza.kotlinplayground.service

import org.gonza.kotlinplayground.domain.Players

class PlayersCreator {
    fun create(allPlayerName: String): Players {
        val playerNameList = splitPlayerName(allPlayerName)

        validatePlayerNameList(playerNameList)

        return Players(emptyList())
    }

    private fun validatePlayerNameList(splitPlayerList: List<String>) {
        val isValid =
            splitPlayerList.none {
                it.isBlank()
            }

        check(isValid) {
            throw IllegalArgumentException("플레이어가 없습니다.")
        }
    }

    private fun splitPlayerName(allPlayerName: String): List<String> = allPlayerName.split(",")
}
