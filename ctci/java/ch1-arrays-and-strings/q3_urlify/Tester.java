package q3_urlify;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import static q3_urlify.Question.*;

/**
 * Created by jjlee on 7/10/16.
 */
public class Tester {
    @Test
    public void testUrlify() throws Exception {
        char[] a = "Mr John Smith    ".toCharArray();
        char[] b = "Mr John Smith       ".toCharArray();
        char[] c = "Mr John Smith       ".toCharArray();
        char[] d = "I  love   you!              ".toCharArray();
        char[] e = "   ".toCharArray();

        urlify(a, 13);
        assertEquals(a, "Mr%20John%20Smith".toCharArray());
        urlify(b, 13);
        assertEquals(b, "Mr%20John%20Smith   ".toCharArray());
        urlify(c, 14);
        assertEquals(c, "Mr%20John%20Smith%20".toCharArray());
        urlify(d, 15);
        assertEquals(d, "I%20%20love%20%20%20you!%20 ".toCharArray());
        urlify(e, 1);
        assertEquals(e, "%20".toCharArray());
    }
}