import by.issoft.krivonos.algorithms.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BinarySearchTest {

    private final static int[] sortedArray = {3, 8, 11, 16, 18, 88, 99, 153, 170};

    @Test
    void binarySearchPositiveTest() {
        int result = BinarySearch.search(sortedArray, 3);
        assertEquals(0, result);
    }

    @Test
    void binarySearchElementOverThanLastElementTest() {
        int result = BinarySearch.search(sortedArray, 3000);
        assertEquals(-1, result);
    }

    @Test
    void binarySearchElementLessThanFirstElementTest() {
        int result = BinarySearch.search(sortedArray, -2);
        assertEquals(-1, result);
    }
}