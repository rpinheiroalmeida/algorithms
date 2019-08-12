package minimumloss

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinimumLossTest {

    @Test
    fun `calculate minum loss for input 5 10 3` () {
        assertEquals(2, minimumLoss(arrayOf(5, 10, 3)))
    }

    @Test
    fun `calculate minum loss for input 20 7 8 2 5` () {
        assertEquals(2, minimumLoss(arrayOf(20, 7, 8, 2, 5)))
    }

    @Test
    fun `calculate minum loss for input 20 15 8 2 12` () {
        assertEquals(3, minimumLoss(arrayOf(20, 15, 8, 2, 12)))
    }

    @Test
    fun `calculate minum loss for input 3 8 9 6 1` () {
        assertEquals(2, minimumLoss(arrayOf(3, 8, 9, 6, 1)))
    }

    @Test
    fun `calculate minum loss for input 5 20 7 8 2 4` () {
        assertEquals(1, minimumLoss(arrayOf(5, 20, 7, 8, 2, 4)))
    }


}