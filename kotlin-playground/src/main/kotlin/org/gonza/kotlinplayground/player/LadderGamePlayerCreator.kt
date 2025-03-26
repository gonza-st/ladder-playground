package org.gonza.kotlinplayground.player

class LadderGamePlayerCreator : PlayerCreator {
    override fun createPlayersBy(names: List<String>): Players {
        if (names.isEmpty()) {
            throw IllegalArgumentException("이름의 목록은 비어있을 수 없습니다.")
        }

        val allPlayers = names.mapIndexed { index, name ->
            LadderGamePlayer(name, index)
        }

        return LadderGamePlayers(allPlayers)
    }
}