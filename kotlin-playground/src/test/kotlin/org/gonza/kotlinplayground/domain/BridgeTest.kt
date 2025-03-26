package org.gonza.kotlinplayground.domain

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class BridgeTest {
    @Test
    fun `다리는 방향을 가질 수 있다`() {
        val leftBridge = Bridge.LeftBridge()
        val rightBridge = Bridge.RightBridge()
        val straightBridge = Bridge.StraightBridge()

        assertTrue { leftBridge is Bridge }
        assertTrue { rightBridge is Bridge }
        assertTrue { straightBridge is Bridge }
    }
}
