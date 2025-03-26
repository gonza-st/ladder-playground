package org.gonza.kotlinplayground.player

/**
 * @property name - 플레이어의 이름
 * @property position - 플레이어가 사다리 위에 위치할 위치
 * >> 사다리가 0번부터 시작해야한다는걸 이쪽에서 알아야하는 상황이 되어버림
 */

class LadderGamePlayer(
    override val name: String,
    override val position: Int
) : Player {
    companion object {
        const val MAX_NAME_LENGTH = 5
        const val MIN_POSITION = 0;
    }

    init {
        if (name.trim().isEmpty()) {
            throw IllegalArgumentException("이름에 공백 문자열만 사용할 수 없습니다.")
        }

        if (name.length > MAX_NAME_LENGTH) {
            throw IllegalArgumentException("이름은 5글자이하만 가능합니다.")
        }

        if (position < MIN_POSITION) {
            throw IllegalArgumentException("position이 음수일 수 없습니다.")
        }
    }
}