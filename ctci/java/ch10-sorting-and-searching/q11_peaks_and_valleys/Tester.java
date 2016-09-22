package q11_peaks_and_valleys;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q11_peaks_and_valleys.Question.*;

/**
 * Created by jjlee on 9/22/16.
 */
public class Tester {
    int[] arr0, testArr0, arr1, testArr1, arr2, testArr2;

    @BeforeMethod
    public void setup() throws Exception {
        arr0 = new int[]{5,3,1,2,3};
        testArr0 = new int[]{5,1,3,2,3};
        arr1 = new int[]{0,1,2,3,4,5,6,7};
        testArr1 = new int[]{1,0,3,2,5,4,7,6};
        arr2 = new int[]{7,6,5,4,3,2,1,0};
        testArr2 = new int[]{7,5,6,3,4,1,2,0};
    }

    @Test
    public void testToPeaksAndValleys() throws Exception {
        toPeaksAndValleys(arr0);
        assertEquals(arr0, testArr0);
        toPeaksAndValleys(arr1);
        assertEquals(arr1, testArr1);
        toPeaksAndValleys(arr2);
        assertEquals(arr2, testArr2);
    }

    @Test
    public void testToPeaksAndValleysEveryOther() throws Exception {
        toPeaksAndValleysEveryOther(arr0);
        assertEquals(arr0, testArr0);
        toPeaksAndValleysEveryOther(arr1);
        assertEquals(arr1, testArr1);
        toPeaksAndValleysEveryOther(arr2);
        assertEquals(arr2, testArr2);
    }

}