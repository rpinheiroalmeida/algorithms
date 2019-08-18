package connectedcellsingrid

import jdk.nashorn.internal.runtime.arrays.ArrayData
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConnectedCellTest {

    @Test
    fun `test case for cel 4 x 4`() {
        val matrix = arrayOf( arrayOf(1, 1, 0, 0), arrayOf(0, 1, 1, 0), arrayOf(0, 0, 1, 0), arrayOf(1, 0, 0, 0) )

        assertEquals(5, connectedCell(matrix))
    }

    @Test
    fun `test case for cel 3 x 3`() {
        val matrix = arrayOf( arrayOf(1, 1, 0), arrayOf(1, 0, 0), arrayOf(0, 0, 1) )

        assertEquals(3, connectedCell(matrix))
    }

    @Test
    fun `test case for cel 5 x 4`() {
        val matrix = arrayOf(   arrayOf(0, 0, 1, 1),
                                arrayOf(0, 0, 1, 0),
                                arrayOf(0, 1, 1, 0),
                                arrayOf(0, 1, 0, 0),
                                arrayOf(1, 1, 0, 0))

        assertEquals(8, connectedCell(matrix))
    }

    @Test
    fun `test case for cel 7 x 8`() {
        val matrix = arrayOf(
                arrayOf(1, 0, 0, 1, 0, 1, 0, 0),
                arrayOf(0, 0, 0, 0, 0, 0, 0, 1),
                arrayOf(1, 0, 1, 0, 1, 0, 0, 0),
                arrayOf(0, 0, 0, 0, 0, 0, 1, 0),
                arrayOf(1, 0, 0, 1, 0, 0, 0, 0),
                arrayOf(0, 0, 0, 0, 0, 0, 0, 1),
                arrayOf(0, 1, 0, 0, 0, 1, 0, 0))

        assertEquals(1, connectedCell(matrix))
    }

    fun connectedCell(matrix: Array<Array<Int>>): Int {
        var seen = Array<Array<Boolean>>(matrix.size, { Array(matrix[0].size, {false}) })

        var res = Int.MIN_VALUE
        for(i in 0..matrix.size - 1) {
            for (j in 0..matrix[i].size - 1) {
                res = Math.max(res, largetsRegion(matrix, seen, i, j))
            }
        }

        return res
    }

    fun largetsRegion(matrix: Array<Array<Int>>, seen: Array<Array<Boolean>>, posX: Int, posY: Int): Int {
        if (posX < 0 || posY < 0 || posX == matrix.size || posY == matrix[posX].size) return 0
        if (matrix[posX][posY] == 0) {
            seen[posX][posY] = true
            return 0
        }
        if (alreadySeen(seen, posX, posY)) {
            return 0
        } else {
            seen[posX][posY] = true
            return  1 + (
                            largetsRegion(matrix, seen, posX-1, posY-1) +
                            largetsRegion(matrix, seen, posX-1, posY) +
                            largetsRegion(matrix, seen, posX-1, posY+1) +
                            largetsRegion(matrix, seen, posX, posY-1) +
                            largetsRegion(matrix, seen, posX, posY+1) +
                            largetsRegion(matrix, seen, posX+1, posY+1) +
                            largetsRegion(matrix, seen, posX+1, posY) +
                            largetsRegion(matrix, seen, posX+1, posY-1))
        }
    }

    private fun alreadySeen(seen: Array<Array<Boolean>>, posX: Int, posY: Int): Boolean {
        return seen[posX][posY]
    }
}