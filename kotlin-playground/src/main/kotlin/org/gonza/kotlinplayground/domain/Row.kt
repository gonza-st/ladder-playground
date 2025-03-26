package org.gonza.kotlinplayground.domain

class Row(
    val pointList: List<Point>,
    val depth: Int,
) {
    fun size(): Int {
        return this.pointList.size
    }

    constructor(
        playerCount: Int,
        depth: Int,
    ) : this(pointList = createPoint(count = playerCount, depth = depth), depth = depth)

    companion object {
        internal fun createPoint(count: Int, depth: Int): List<Point> {
            val pointList = mutableListOf<Point>()
            var bool = false

            for (i in 0 until count) {
                if (bool) {
                    Point(i, depth, false)
                    continue
                }
                val isDraw: Boolean = generate()
                pointList.add(Point(i, depth, isDraw))
                bool = true
            }
            return pointList
        }

        private fun generate() {
        }
    }
}
