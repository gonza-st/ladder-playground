package org.gonza.kotlinplayground.player

/**
 * 사용자 생성기
 * */
interface PlayerCreator {
    fun createPlayersBy(names: List<String>): Players
}