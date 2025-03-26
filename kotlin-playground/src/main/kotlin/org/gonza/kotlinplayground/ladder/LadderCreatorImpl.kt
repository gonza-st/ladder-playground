package org.gonza.kotlinplayground.ladder

class LadderCreatorImpl : LadderCreator {
    companion object {
        const val COLS_LIMIT = 1
    }
    override fun createLadder(cols: Int): Ladder {
        unSuitable(cols)
        
        return object : Ladder {
            override val rows: List<Row> = listOf(
                object : Row {
                    override val components: List<Component> =
                        List(cols) {
                            Component.COLUMN_EXIST
                            Component.ROW_EXIST
                            Component.COLUMN_EXIST
                        }
                }
            )
        }
    }

    private fun unSuitable(cols: Int) {
        if (cols < COLS_LIMIT) {
            throw IllegalArgumentException("0 미만일 수 없습니다.")
        }
    }
}
