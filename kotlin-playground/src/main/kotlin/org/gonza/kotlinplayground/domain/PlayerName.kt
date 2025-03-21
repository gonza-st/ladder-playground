package org.gonza.kotlinplayground.domain

data class PlayerName(
    var value: String,
    ) {
    companion object {
        private const val MIN_NAME_LENGTH = 1
        private const val MAX_NAME_LENGTH = 5
    }
    init {
        value = value.trim()
        require(value.length <= MAX_NAME_LENGTH) {
            throw IllegalArgumentException("이름 길이가 5자 이하여야 합니다.")
        }

        require(value.length >= MIN_NAME_LENGTH) {
            throw IllegalArgumentException("이름 길이가 1글자 이상이어야 합니다.")
        }
    }

}
