package org.gonza.kotlinplayground.domain.exception

sealed class DomainException(
    override val message: String,
) : RuntimeException(message) {
    class EmptyPlayerListException(
        message: String = "유저 목록은 비어있을 수 없습니다.",
    ) : DomainException(message)
}
