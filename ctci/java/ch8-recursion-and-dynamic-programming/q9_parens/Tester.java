package q9_parens;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.testng.Assert.*;
import static q9_parens.QuestionA.*;
import static q9_parens.QuestionB.*;

/**
 * Created by jjlee on 9/5/16.
 */
public class Tester {
    HashSet<String> zeroParens, oneParens, twoParens, threeParens, fourParens;

    @BeforeMethod
    public void setup() throws Exception {
        zeroParens = new HashSet<>();
        zeroParens.add("");
        oneParens = new HashSet<>();
        oneParens.add("()");
        twoParens = new HashSet<>();
        twoParens.add("(())");
        twoParens.add("()()");
        threeParens = new HashSet<>();
        threeParens.add("((()))");
        threeParens.add("(()())");
        threeParens.add("(())()");
        threeParens.add("()(())");
        threeParens.add("()()()");
        fourParens = new HashSet<>();
        fourParens.add("(((())))");
        fourParens.add("((()()))");
        fourParens.add("((())())");
        fourParens.add("((()))()");
        fourParens.add("(()(()))");
        fourParens.add("(()()())");
        fourParens.add("(()())()");
        fourParens.add("(())(())");
        fourParens.add("(())()()");
        fourParens.add("()((()))");
        fourParens.add("()(()())");
        fourParens.add("()(())()");
        fourParens.add("()()(())");
        fourParens.add("()()()()");
    }

    @Test
    public void testGenerateParens() throws Exception {
        ArrayList<String> zero = generateParens(0);
        assertEquals(zero.size(), 1);
        for (String s : zero) {
            assertTrue(zeroParens.contains(s));
        }
        ArrayList<String> one = generateParens(1);
        assertEquals(one.size(), 1);
        for (String s : one) {
            assertTrue(oneParens.contains(s));
        }
        ArrayList<String> two = generateParens(2);
        assertEquals(two.size(), 2);
        for (String s : two) {
            assertTrue(twoParens.contains(s));
        }
        ArrayList<String> three = generateParens(3);
        assertEquals(three.size(), 5);
        for (String s : three) {
            assertTrue(threeParens.contains(s));
        }
        ArrayList<String> four = generateParens(4);
        assertEquals(four.size(), 14);
        for (String s : four) {
            assertTrue(fourParens.contains(s));
        }
    }

    @Test
    public void testGenerateParensSubProblems() throws Exception {
        ArrayList<String> zero = generateParensSubProblems(0);
        assertEquals(zero.size(), 1);
        for (String s : zero) {
            assertTrue(zeroParens.contains(s));
        }
        ArrayList<String> one = generateParensSubProblems(1);
        assertEquals(one.size(), 1);
        for (String s : one) {
            assertTrue(oneParens.contains(s));
        }
        ArrayList<String> two = generateParensSubProblems(2);
        assertEquals(two.size(), 2);
        for (String s : two) {
            assertTrue(twoParens.contains(s));
        }
        ArrayList<String> three = generateParensSubProblems(3);
        assertEquals(three.size(), 5);
        for (String s : three) {
            assertTrue(threeParens.contains(s));
        }
        ArrayList<String> four = generateParensSubProblems(4);
        assertEquals(four.size(), 14);
        for (String s : four) {
            assertTrue(fourParens.contains(s));
        }
    }

}