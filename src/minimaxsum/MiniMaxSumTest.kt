package minimaxsum

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class MiniMaxSumTest {
    @Test fun `test for input {1 2 3 4 5}`() {
        val input:Array<Int> = arrayOf(1, 2, 3, 4, 5)

        assertTrue(arrayOf(10, 14) contentDeepEquals miniMaxSum(input))
    }

    @Test fun `test for input {1 3 5 7 9}`() {
        val input:Array<Int> = arrayOf(1, 3, 5, 7, 9)

        assertTrue(arrayOf(16, 24) contentDeepEquals miniMaxSum(input))
    }

    @Test fun `test for input {1 1 1 1 1}`() {
        val input:Array<Int> = arrayOf(1, 1, 1, 1, 1)

        assertTrue(arrayOf(4, 4) contentDeepEquals miniMaxSum(input))
    }

    @Test fun `test for input {1 2 3 3 5}`() {
        val input:Array<Int> = arrayOf(1, 2, 3, 3, 5)

        assertTrue(arrayOf(9, 13) contentDeepEquals miniMaxSum(input))
    }

    @Test fun `test for input {256741038 623958417 467905213 714532089 938071625}`() {
        val input:Array<Int> = arrayOf(256741038,623958417, 467905213, 714532089, 938071625)

        assertTrue(arrayOf(2063136757, 2744467344) contentDeepEquals miniMaxSum(input))
    }

}
