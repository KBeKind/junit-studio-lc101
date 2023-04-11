package test;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;
public class BonusBinarySearchTest {
    int[] testArray = {1,2,3,4,5,6,7,8};
    @Test
    public void findsAnExistingIntInBeginningOfTheArray() {

        assertTrue(BonusBinarySearch.binarySearch(testArray, 1) > -1);
    }
    @Test
    public void returnsIndexOfZeroIfSearchNumberIsAtIndexZero() {
        assertTrue(BonusBinarySearch.binarySearch(testArray, 1) == 0);
    }

    @Test
    public void returnsIndexOfSearchNumberAtTheLastIndexOfTheArray() {
        String spec = "Returns the Index Equal to the Array Length -1 if the searched number is at the last index of the array.";
        assertEquals(BonusBinarySearch.binarySearch(testArray, 8), 7);
    }


    @Test
    public void returnsNegativeOneForNumberNotInTheArray() {
        assertEquals(BonusBinarySearch.binarySearch(testArray, 9), -1);
    }
}
