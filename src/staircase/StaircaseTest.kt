package staircase

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StaircaseTest {

    @Test
    fun buildStairCaseWithOneStep() {
        assertEquals("#\n", staircase(1))
    }

    @Test
    fun buildStairCaseWithSixSteps() {
        assertEquals(
                "     #\n" +
                         "    ##\n" +
                         "   ###\n" +
                         "  ####\n" +
                         " #####\n" +
                         "######\n", staircase(6))
    }

}