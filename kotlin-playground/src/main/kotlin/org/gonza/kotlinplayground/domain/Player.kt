package org.gonza.kotlinplayground.domain

class Player(
    private val name: String,
) {
    init {
        require(name.length <= 5) {
            throw IllegalArgumentException("플레이어의 이름은 5글자를 초과할 수 없습니다.")
        }

        require(name.isNotBlank()) {
            throw IllegalArgumentException("플레이어의 이름은 공백일 수 없습니다.")
        }
    }
}
