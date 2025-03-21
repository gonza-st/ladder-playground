package org.gonza.kotlinplayground.domain

import org.gonza.kotlinplayground.domain.exception.DomainException

class Players(
    private val playerList: List<Player>,
) {
    init {
        require(playerList.isNotEmpty()) {
            throw DomainException.EmptyPlayerListException()
        }
    }
}
