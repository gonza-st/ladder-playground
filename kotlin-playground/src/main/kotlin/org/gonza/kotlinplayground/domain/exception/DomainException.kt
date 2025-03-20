package org.gonza.kotlinplayground.domain.exception

abstract class DomainException(
    override val message: String,
) : RuntimeException(message)
