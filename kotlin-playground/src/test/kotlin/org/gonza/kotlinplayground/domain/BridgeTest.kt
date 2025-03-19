package org.gonza.kotlinplayground.domain

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class BridgeTest {
    @Test
    fun `방향이 정해진 다리를 생성할 수 있다`() {
        val leftBridge = Bridge.LeftBridge()
        val rightBridge = Bridge.RightBridge()
        val straightBridge = Bridge.StraightBridge()

        assertTrue { leftBridge is Bridge }
        assertTrue { rightBridge is Bridge }
        assertTrue { straightBridge is Bridge }
    }
}
