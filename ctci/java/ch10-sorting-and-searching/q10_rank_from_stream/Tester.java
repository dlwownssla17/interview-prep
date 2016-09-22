package q10_rank_from_stream;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by jjlee on 9/22/16.
 */
public class Tester {
    RankFromStream r;

    @BeforeMethod
    public void setup() throws Exception {
        r = new RankFromStream();
    }

    @Test
    public void testRankFromStream() throws Exception {
        r.track(5);
        assertEquals(r.getRankOfNumber(5), 0);
        assertEquals(r.getRankOfNumber(1), -1);
        r.track(1);
        assertEquals(r.getRankOfNumber(1), 0);
        r.track(4);
        assertEquals(r.getRankOfNumber(4), 1);
        r.track(4);
        assertEquals(r.getRankOfNumber(4), 3);
        r.track(5);
        assertEquals(r.getRankOfNumber(5), 4);
        r.track(9);
        assertEquals(r.getRankOfNumber(9), 5);
        r.track(7);
        assertEquals(r.getRankOfNumber(7), 5);
        r.track(13);
        assertEquals(r.getRankOfNumber(13), 7);
        r.track(3);
        assertEquals(r.getRankOfNumber(3), 1);
        assertEquals(r.getRankOfNumber(4), 3);
        r.track(7);
        assertEquals(r.getRankOfNumber(7), 12);
        assertEquals(r.getRankOfNumber(2), -1);
        r.track(1);
        assertEquals(r.getRankOfNumber(1), 1);
        r.track(17);
        assertEquals(r.getRankOfNumber(17), 11);
    }
}