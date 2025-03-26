package org.gonza.kotlinplayground.domain

import org.gonza.kotlinplayground.domain.exception.DomainException

class Bridge(
    private val directions: List<Direction>,
) {
    init {
        require(directions.isNotEmpty()) {
            throw DomainException.EmptyDirectionListException()
        }
    }
}
