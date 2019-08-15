package maximumsubarray

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MaximumSubArrayTest {

    @Test
    fun `test case for input 1 2 3 and m = 2`() {
        val input = arrayOf(1L, 2L, 3L)

        assertEquals(1, maximumSum(input, 2))
    }

    @Test
    fun `test case for input 3 3 9 9 5 and m = 7`() {
        val input = arrayOf(3L, 3L, 9L, 9L, 5L)

        assertEquals(6, maximumSum(input, 7))
    }

    @Test
    fun `test case for input 1 5 9 and m = 5`() {
        val input = arrayOf(1L, 5L, 9L)

        assertEquals(4, maximumSum(input, 5))
    }

}