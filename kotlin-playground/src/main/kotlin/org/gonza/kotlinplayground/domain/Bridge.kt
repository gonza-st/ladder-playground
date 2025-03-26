package org.gonza.kotlinplayground.domain

sealed class Bridge {
    class LeftBridge : Bridge()

    class RightBridge : Bridge()

    class StraightBridge : Bridge()
}
