package q8_find_duplicates;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q8_find_duplicates.Question.*;

/**
 * Created by jjlee on 9/21/16.
 */
public class Tester {
    int[] arr;

    @BeforeMethod
    public void setup() throws Exception {
        arr = new int[]{1357,32000,1,1357,420,42,42,42,1};
    }

    @Test
    public void testFindDuplicates() throws Exception {
        findDuplicates(arr);
    }

}