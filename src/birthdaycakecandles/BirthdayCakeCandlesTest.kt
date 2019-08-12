package birthdaycakecandles

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BirthdayCakeCandlesTest {

    @Test
    fun `birthday cake candles for input {3 2 1 3 }`() {

        Assertions.assertEquals(2, birthdayCakeCandles(arrayOf(3,2,1,3)))
    }
}