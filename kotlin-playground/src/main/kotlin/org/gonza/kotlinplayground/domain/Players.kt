package org.gonza.kotlinplayground.domain

class Players(
    private val playerList: List<Player>,
) {
    init {
        require(playerList.isNotEmpty()) {
            throw IllegalArgumentException("유저 목록은 비어있을 수 없습니다.")
        }
    }
}
