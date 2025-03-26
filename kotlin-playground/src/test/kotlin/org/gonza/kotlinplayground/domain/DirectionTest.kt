package org.gonza.kotlinplayground.domain

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class DirectionTest {
    @Test
    fun `왼쪽, 오른쪽, 직전의 방향을 생성할 수 있다`() {
        val left = Direction.Left()
        val right = Direction.Right()
        val straight = Direction.Straight()

        assertTrue { left is Direction }
        assertTrue { right is Direction }
        assertTrue { straight is Direction }
    }
}
