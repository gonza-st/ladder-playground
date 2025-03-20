package org.gonza.kotlinplayground.ladder

/**
 * 사다리 생성기
 * */
interface LadderCreator {
    fun createLadder(cols: Int): Ladder
}
