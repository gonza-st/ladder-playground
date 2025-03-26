package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions.*
import org.gonza.kotlinplayground.domain.exception.DomainException
import org.junit.jupiter.api.Test

class BridgesTest {
    @Test
    fun `다리의 높이는 0 보다 커야한다`() {
        val emptyBridgeList = emptyList<Bridge>()

        assertThatThrownBy { Bridges(emptyBridgeList) }
            .isInstanceOf(DomainException.BridgeHeightOverZeroException::class.java)
    }
}
