package q7_permutations_without_dups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.testng.Assert.*;
import static q7_permutations_without_dups.QuestionA.*;
import static q7_permutations_without_dups.QuestionB.*;

/**
 * Created by jjlee on 9/5/16.
 */
public class Tester {
    HashSet<String> permutationsCat, permutationsFive;

    @BeforeMethod
    public void setup() throws Exception {
        permutationsCat = new HashSet<>();
        permutationsCat.add("cat");
        permutationsCat.add("cta");
        permutationsCat.add("act");
        permutationsCat.add("atc");
        permutationsCat.add("tca");
        permutationsCat.add("tac");
        permutationsFive = new HashSet<>();
        permutationsFive.add("five");
        permutationsFive.add("fiev");
        permutationsFive.add("fvie");
        permutationsFive.add("fvei");
        permutationsFive.add("feiv");
        permutationsFive.add("fevi");
        permutationsFive.add("ifve");
        permutationsFive.add("ifev");
        permutationsFive.add("ivfe");
        permutationsFive.add("ivef");
        permutationsFive.add("iefv");
        permutationsFive.add("ievf");
        permutationsFive.add("vfie");
        permutationsFive.add("vfei");
        permutationsFive.add("vife");
        permutationsFive.add("vief");
        permutationsFive.add("vefi");
        permutationsFive.add("veif");
        permutationsFive.add("efiv");
        permutationsFive.add("efvi");
        permutationsFive.add("eifv");
        permutationsFive.add("eivf");
        permutationsFive.add("evfi");
        permutationsFive.add("evif");
    }

    @Test
    public void testPermutationsWithoutDups() throws Exception {
        ArrayList<String> cat = permutationsWithoutDups("cat");
        assertEquals(cat.size(), 6);
        for (String permutation : cat) {
            assertTrue(permutationsCat.contains(permutation));
        }
        ArrayList<String> five = permutationsWithoutDups("five");
        assertEquals(five.size(), 24);
        for (String permutation : five) {
            assertTrue(permutationsFive.contains(permutation));
        }
    }

    @Test
    public void testPermutationsWithoutDupsSubProblems() throws Exception {
        ArrayList<String> cat = permutationsWithoutDupsSubProblems("cat");
        assertEquals(cat.size(), 6);
        for (String permutation : cat) {
            assertTrue(permutationsCat.contains(permutation));
        }
        ArrayList<String> five = permutationsWithoutDupsSubProblems("five");
        assertEquals(five.size(), 24);
        for (String permutation : five) {
            assertTrue(permutationsFive.contains(permutation));
        }
    }

}