package org.gonza.kotlinplayground.domain

sealed class Direction {
    class Left : Direction()

    class Right : Direction()

    class Straight : Direction()
}
