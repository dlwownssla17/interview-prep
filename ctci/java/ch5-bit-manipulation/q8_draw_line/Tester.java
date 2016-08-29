package q8_draw_line;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static q8_draw_line.Question.*;

/**
 * Created by jjlee on 8/28/16.
 */
public class Tester {
    static byte[] a, b, c;
    int aWidth, bWidth, cWidth;
    static int BYTE_LENGTH = 8;

    @BeforeMethod
    public void setup() throws Exception {
        a = new byte[5];
        b = new byte[60];
        c = new byte[5];
        aWidth = 5 * BYTE_LENGTH;
        bWidth = 12 * BYTE_LENGTH;
        cWidth = BYTE_LENGTH;
    }

    @Test
    public void testDrawLine() throws Exception {
        try { drawLine(a, aWidth, 15, 40, 0); fail(); } catch(IndexOutOfBoundsException e) { } catch(Exception e) { fail(); }
        try { drawLine(a, aWidth, -1, 39, 0); fail(); } catch(IndexOutOfBoundsException e) { } catch(Exception e) { fail(); }
        drawLine(a, aWidth, 29, 3, 0);
        drawLine(a, aWidth, 1, 7, 0);
        drawLine(a, aWidth, 31, 31, 0);
        printScreen(a, aWidth);
        System.out.println();

        drawLine(b, bWidth, 0, 0, 3);
        drawLine(b, bWidth, 16, 31, 1);
        drawLine(b, bWidth, 95, 0, 0);
        drawLine(b, bWidth, 3, 63, 3);
        printScreen(b, bWidth);
        System.out.println();

        drawLine(c, cWidth, 1, 7, 0);
        drawLine(c, cWidth, 4, 4, 4);
        drawLine(c, cWidth, 4, 0, 3);
        drawLine(c, cWidth, 0, 0, 4);
        drawLine(c, cWidth, 7, 7, 3);
        drawLine(c, cWidth, 0, 7, 1);
        printScreen(c, cWidth);
        System.out.println();
    }

}