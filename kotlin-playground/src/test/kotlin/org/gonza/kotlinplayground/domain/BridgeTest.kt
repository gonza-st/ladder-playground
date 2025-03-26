package org.gonza.kotlinplayground.domain

import org.assertj.core.api.Assertions.*
import org.gonza.kotlinplayground.domain.exception.DomainException
import org.junit.jupiter.api.Test

class BridgeTest {
    @Test
    fun `Bridge는 방향이 없는 경우 예외가 발생한다`() {
        val emptyDirectionList = emptyList<Direction>()

        assertThatThrownBy { Bridge(emptyDirectionList) }
            .isInstanceOf(DomainException.EmptyDirectionListException::class.java)
    }
}
