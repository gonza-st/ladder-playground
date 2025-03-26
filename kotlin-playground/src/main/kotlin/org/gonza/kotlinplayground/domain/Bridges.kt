package org.gonza.kotlinplayground.domain

import org.gonza.kotlinplayground.domain.exception.DomainException

class Bridges(
    private val bridges: List<Bridge>,
) {
    init {
        require(bridges.isNotEmpty()) {
            throw DomainException.BridgeHeightOverZeroException()
        }
    }
}
