package q6_string_compression;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static q6_string_compression.Question.*;

/**
 * Created by jjlee on 7/12/16.
 */
public class Tester {
    @Test
    public void testCompress() throws Exception {
        assertEquals(compress("aabcccccaaa"), "a2b1c5a3");
        assertEquals(compress(""), "");
        assertEquals(compress("a"), "a");
        assertEquals(compress("aa"), "aa");
        assertEquals(compress("aaa"), "a3");
        assertEquals(compress("AAaaaabbbBCcc"), "A2a4b3B1C1c2");
        assertEquals(compress("aaaaaaaaaaaa"), "a12");
    }

}