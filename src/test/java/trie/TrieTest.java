package trie;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TrieTest {

    @Test
    public void addingNewElement() {
        Trie trie = new Trie();
        trie.add("slowo");

        assertTrue(trie.isCorrectWord("slowo"));
    }

    @Test
    public void gettingPossibilities() {
        Trie trie = new Trie();
        trie.add("slowo");
        trie.add("slowa");

        assertEquals(trie.getPossibilities("slow"), new ArrayList<Character>(){{ add('a'); add('o');}});
    }





}
