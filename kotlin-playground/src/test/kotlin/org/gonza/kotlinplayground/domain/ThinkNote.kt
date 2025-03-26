package org.gonza.kotlinplayground.domain

import java.util.Random

class ThinkNote {
}


// Point는 위치값인데 얘가 모든 걸 표현하려고 했더니 문제가 된 것 같다
// 제안하는 건

// Player가 자기 위치를 가지지 말고 index만 가지자
// Row = List<Position>
class Row2(
    positions: List<Position>,
) {
    fun generate(count: Int) {
        val list = mutableListOf<Position>()

        for (i in 0 until count) {
            if (list.isEmpty()) {
                list.add(Position.first(0, random()))
            }
        }
    }

    private fun random(): Boolean {
        val random = Random()
        return random.nextBoolean()
    }
}

class Position(
    val index: Int,
    val point: Point2,
) {


    companion object {
        fun first(i: Int, random: Boolean): Position {
            return Position(index = i, point = Point2.first(random))
        }
    }
}

// 나중에 left true -> Direction Left
// 나중에 right true -> Direction Right
class Point2(
    val left: Boolean,
    val current: Boolean,
) {
    companion object {
        fun first(random: Boolean): Point2 {
            return Point2(left = false, current = random)
        }
    }
}
