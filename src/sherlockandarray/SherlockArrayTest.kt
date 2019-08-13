package sherlockandarray

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SherlockArrayTest {

    @Test
    fun `sherlock and array for case 2 0 0 0`() {
        val arr = arrayOf(2, 0, 0, 0)

        assertEquals("YES", balancedSums(arr))
    }

    @Test
    fun `sherlock and array for case 1 1 4 1 1`() {
        val arr = arrayOf(1, 1, 4, 1, 1)

        assertEquals("YES", balancedSums(arr))
    }

    @Test
    fun `sherlock and array for case 0 0 2 0`() {
        val arr = arrayOf(0, 0, 2, 0)

        assertEquals("YES", balancedSums(arr))
    }

    @Test
    fun `sherlock and array for case 1 2 3`() {
        val arr = arrayOf(1, 2, 3)

        assertEquals("NO", balancedSums(arr))
    }

}