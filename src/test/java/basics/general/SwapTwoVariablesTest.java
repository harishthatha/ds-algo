package basics.general;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTwoVariablesTest {

    private SwapTwoVariables swapTwoVariables;

    @BeforeEach
    void setUp() {
        swapTwoVariables = new SwapTwoVariables();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test swapping without third variable")
    void testSwap() {
        assertArrayEquals(new int[]{65,23},swapTwoVariables.swap(23,65));
        assertArrayEquals(new String[]{"harish","Yadav"},swapTwoVariables.swap("Yadav","harish"));
    }
}