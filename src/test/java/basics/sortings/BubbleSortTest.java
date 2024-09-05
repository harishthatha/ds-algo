package basics.sortings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSort() {
        assertArrayEquals(new int[]{1,2,5,23,34},bubbleSort.sort(new int[]{34,23,2,5,1}));
        assertArrayEquals(new int[]{1,2,5,34,23123213},bubbleSort.sort(new int[]{34,23123213,2,5,1}));
        assertArrayEquals(new int[]{11, 12, 22, 25, 64},bubbleSort.sort(new int[]{64,25,12,22,11}));
    }
}