package org.gonza.kotlinplayground.service

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PlayersCreatorTest {
    @Test
    fun `참여자를 구분자로 구분했을때 참여자가 없다면 예외가 발생한다`() {
        val whitespace = ""
        val whiteSpaceWithSplit = ",,,,"
        val playersCreator = PlayersCreator()

        assertThatThrownBy {
            playersCreator.create(whitespace)
        }.isInstanceOf(IllegalArgumentException::class.java)
        assertThatThrownBy {
            playersCreator.create(whiteSpaceWithSplit)
        }.isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun `입력한 이름으로 플레이어를 생성할 수 있다`() {
        val testName = "test"
        val pobiName = "pobi"
        val inputName = "$testName,$pobiName"
        val playersCreator = PlayersCreator()

        val players = playersCreator.create(inputName)
        val nameList = players.getNameList()

        assertEquals(nameList[0], testName)
        assertEquals(nameList[1], pobiName)
    }
}
