package org.gonza.kotlinplayground.ladder

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class LadderCreatorTest {
    val sut: LadderCreator = LadderCreatorImpl()

    @ParameterizedTest
    @ValueSource(ints = [2])
    fun `row를 가진 ladder를 생성할 수 있다`(cols: Int) {
        val actual = sut.createLadder(cols)

        assertNotNull(actual)
    }

    @ParameterizedTest
    @ValueSource(ints = [2, 3, 4])
    fun `cols 수 만큼 의 row를 가진 ladder를 생성할 수 있다`(cols: Int) {
        val actual = sut.createLadder(cols)

        assertEquals(actual.rows.first().components.size, cols)
    }

    @ParameterizedTest
    @ValueSource(ints = [0, -1])
    fun `cols는 1 미만의 값은 들어갈 수 없다`(cols: Int) {
        assertThrows<IllegalArgumentException> {
            sut.createLadder(cols)
        }
    }
}