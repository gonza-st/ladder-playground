package org.gonza.kotlinplayground.domain.exception

sealed class DomainException(
    override val message: String,
) : RuntimeException(message) {
    class EmptyPlayerListException(
        message: String = "유저 목록은 비어있을 수 없습니다.",
    ) : DomainException(message)

    class BridgeHeightOverZeroException(
        message: String = "다리의 높이는 0 보다 커야합니다.",
    ) : DomainException(message)
}
