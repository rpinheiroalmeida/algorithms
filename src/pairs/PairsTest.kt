package pairs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PairsTest {

    @Test
    fun `pairs for case 1 5 3 4 2`() {
        val arr = arrayOf(1, 5, 3, 4, 2)

        assertEquals(3, pairs(2, arr))
    }
}