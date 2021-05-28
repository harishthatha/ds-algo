package leetcode.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienDictionaryTest {

    private AlienDictionary alienDictionary;
    private String order;

    @BeforeEach
    void setUp() {
        alienDictionary = new AlienDictionary();
        order = "hlabcdefgijkmnopqrstuvwxyz";
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isAlienSorted() {
        assertTrue(alienDictionary.isAlienSorted(new String[]{"hello","leetcode"},order));
        assertFalse(alienDictionary.isAlienSorted(new String[]{"apple","a","app","sadhfjknhkj"},order));
       // assertFalse(alienDictionary.isAlienSorted(new String[]{"word","world","row"},order));
    }
}