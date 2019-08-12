package timeconversion

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TimeConversionTest {

    @Test
    fun `time conversion for 07H05M45PM`() {
        assertEquals("19:05:45", timeConversion("07:05:45PM"))
    }

    @Test
    fun `time conversion for 11H05M45PM`() {
        assertEquals("23:05:45", timeConversion("11:05:45PM"))
    }

    @Test
    fun `time conversion for 12H05M45PM`() {
        assertEquals("12:05:45", timeConversion("12:05:45PM"))
    }

    @Test
    fun `time conversion for 12H40M22AM`() {
        assertEquals("00:40:22", timeConversion("12:40:22AM"))
    }

    @Test
    fun `time conversion for 06H40M03AM`() {
        assertEquals("06:40:03", timeConversion("06:40:03AM"))
    }
}