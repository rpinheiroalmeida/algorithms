import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class CompareTheTripletsTest {

    @Test
    public void tiedNotes() {
        List notesA = Arrays.asList(5,6,7);
        List notesB = Arrays.asList(3,6,10);

        List result = CompareTheTriplets.compareTriplets(notesA, notesB);
        Assertions.assertEquals(Arrays.asList(1,1), result);
    }

    @Test
    public void anaVictories() {
        List notesA = Arrays.asList(17, 28, 30);
        List notesB = Arrays.asList(99, 16, 8);

        List result = CompareTheTriplets.compareTriplets(notesA, notesB);
        Assertions.assertEquals(Arrays.asList(2,1), result);
    }

    @Test
    public void equalNotes() {
        List notesA = Arrays.asList(1, 2, 3);
        List notesB = Arrays.asList(1, 2, 3);

        List result = CompareTheTriplets.compareTriplets(notesA, notesB);
        Assertions.assertEquals(Arrays.asList(0,0), result);
    }
}