package leetcode.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisCheckTest {

    private ParenthesisCheck parenthesisCheck;

    @BeforeEach
    void setUp() {
        parenthesisCheck = new ParenthesisCheck();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void TestIsValid() {
        assertTrue(parenthesisCheck.isValid("[[]]"));
        assertFalse(parenthesisCheck.isValid("[]{{}{}}{}}}}}{{{}{}{{}{{}{]]]]]}][()"));
    }
}