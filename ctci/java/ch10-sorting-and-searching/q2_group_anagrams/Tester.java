package q2_group_anagrams;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q2_group_anagrams.QuestionA.*;
import static q2_group_anagrams.QuestionB.*;

/**
 * Created by jjlee on 9/12/16.
 */
public class Tester {
    static String[] arr0, test0, arr1, test1;

    @BeforeMethod
    public void setup() throws Exception {
        arr0 = new String[]{ "abc", "ghi", "def" };
        test0 = new String[]{ "abc", "def", "ghi" };
        arr1 = new String[]{ "fedg", "gefd", "abc", "fdeg", "cab", "hi" };
        test1 = new String[]{ "abc", "cab", "fedg", "gefd", "fdeg", "hi" };
    }

    @Test
    public void testGroupAnagrams() throws Exception {
        groupAnagrams(arr0);
        assertEquals(arr0, test0);
        groupAnagrams(arr1);
        assertEquals(arr1, test1);
    }

    @Test
    public void testGroupAnagramsHashMap() throws Exception {
        groupAnagramsHashMap(arr0);
        printArray(arr0);
        groupAnagramsHashMap(arr1);
        printArray(arr1);
    }

    private void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}