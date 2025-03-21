package org.gonza.kotlinplayground.domain

class Row(
    pointList: List<Point>,
    depth: Int,
) {
    constructor(
        playerCount: Int,
        depth: Int,
    ) : this(pointList = listOf(), depth = depth) {
    }
}
