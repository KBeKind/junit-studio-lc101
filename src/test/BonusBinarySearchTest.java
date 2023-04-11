package test;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;
public class BonusBinarySearchTest {
    int[] testArray = {1,2,3,4,5,6,7,8};
    int[] testArray2 ={0,2,5,8,10,11,12,20};
    @Test
    public void findsAnExistingIntInTheArray() {
        assertTrue(BonusBinarySearch.binarySearch(testArray, 2) > -1);
        assertTrue(BonusBinarySearch.binarySearch(testArray2, 2) > -1);
    }
    @Test
    public void returnsIndexOfZeroIfSearchNumberIsAtIndexZero() {
        assertTrue(BonusBinarySearch.binarySearch(testArray, 1) == 0);
        assertTrue(BonusBinarySearch.binarySearch(testArray2, 0) == 0);
    }

    @Test
    public void returnsIndexOfSearchNumberAtTheLastIndexOfTheArray() {
        String spec = "Returns the Index Equal to the Array Length -1 if the searched number is at the last index of the array.";
        assertEquals(BonusBinarySearch.binarySearch(testArray, 8), testArray.length-1);
        assertEquals(BonusBinarySearch.binarySearch(testArray2,20), testArray2.length-1);
    }

    @Test
    public void returnsNegativeOneForNumberHigherThanNumbersInTheArray() {
        assertEquals(BonusBinarySearch.binarySearch(testArray, 9), -1);
        assertEquals(BonusBinarySearch.binarySearch(testArray2, 21), -1);
    }

    @Test
    public void returnsNegativeOneForNumberLowerThanNumbersInTheArray() {
        assertEquals(BonusBinarySearch.binarySearch(testArray, 0), -1);
        assertEquals(BonusBinarySearch.binarySearch(testArray2, -2), -1);
    }

    @Test
    public void returnsNegativeOneForNumberNotInTheArrayAboveLowestValueAndBelowHighestValue() {
        assertEquals(BonusBinarySearch.binarySearch(testArray2, 7), -1);
    }
}
