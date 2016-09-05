package q8_permutations_with_dups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.testng.Assert.*;
import static q8_permutations_with_dups.Question.*;

/**
 * Created by jjlee on 9/5/16.
 */
public class Tester {
    HashSet<String> permutationsCat, permutationsFive, permutationsEevee, permutationsWww;

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
        permutationsEevee = new HashSet<>();
        permutationsEevee.add("eeeev");
        permutationsEevee.add("eeeve");
        permutationsEevee.add("eevee");
        permutationsEevee.add("eveee");
        permutationsEevee.add("veeee");
        permutationsWww = new HashSet<>();
        permutationsWww.add("www");
    }

    @Test
    public void testPermutationsWithDups() throws Exception {
        ArrayList<String> cat = permutationsWithDups("cat");
        assertEquals(cat.size(), 6);
        for (String permutation : cat) {
            assertTrue(permutationsCat.contains(permutation));
        }
        ArrayList<String> five = permutationsWithDups("five");
        assertEquals(five.size(), 24);
        for (String permutation : five) {
            assertTrue(permutationsFive.contains(permutation));
        }
        ArrayList<String> eevee = permutationsWithDups("eevee");
        assertEquals(eevee.size(), 5);
        for (String permutation : eevee) {
            assertTrue(permutationsEevee.contains(permutation));
        }
        ArrayList<String> www = permutationsWithDups("www");
        assertEquals(www.size(), 1);
        for (String permutation : www) {
            assertTrue(permutationsWww.contains(permutation));
        }
    }

}