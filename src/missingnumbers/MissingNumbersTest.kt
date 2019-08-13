package missingnumbers

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class MissingNumbersTest {

    @Test
    fun `missing numbers for case 203 204 205 206 207 208 203 204 205 206`() {
        val arr = arrayOf(203, 204, 205, 206, 207, 208, 203, 204, 205, 206)
        val brr = arrayOf(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204)

        assertTrue(arrayOf(204, 205, 206) contentDeepEquals missingNumbers(arr, brr))
    }

    @Test
    fun `missing numbers for case 11 4 11 7 13 4 12 11 10 14`() {
        val arr = arrayOf(11, 4, 11, 7, 13, 4, 12, 11, 10, 14)
        val brr = arrayOf(11, 4, 11, 7, 3, 7, 10, 13, 4, 8, 12, 11, 10, 14, 12)

        assertTrue(arrayOf(3, 7, 8, 10, 12) contentDeepEquals missingNumbers(arr, brr))
    }
}