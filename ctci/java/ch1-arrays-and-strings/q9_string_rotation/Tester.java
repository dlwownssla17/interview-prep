package q9_string_rotation;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import static q9_string_rotation.Question.*;

/**
 * Created by jjlee on 7/12/16.
 */
public class Tester {
    @Test
    public void testIsRotation() throws Exception {
        assertTrue(isRotation("erbottlewat", "waterbottle"));
        assertTrue(isRotation("", ""));
        assertTrue(isRotation("A", "A"));
        assertTrue(isRotation("BABA", "ABAB"));
        assertTrue(isRotation("asdfg", "asdfg"));
    }
}