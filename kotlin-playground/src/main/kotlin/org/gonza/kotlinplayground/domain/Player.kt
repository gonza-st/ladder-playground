package org.gonza.kotlinplayground.domain

data class Player(
    val name: String,
    val position: Point
) {
    companion object {
        private const val MIN_NAME_LENGTH = 1
        private const val MAX_NAME_LENGTH = 5
    }
    init {
        require(name.length <= MAX_NAME_LENGTH) {
            throw IllegalArgumentException("이름 길이가 5자 이하여야 합니다.")
        }

        require(name.length >= MIN_NAME_LENGTH) {
            throw IllegalArgumentException("이름 길이가 1글자 이상이어야 합니다.")
        }
    }
}
