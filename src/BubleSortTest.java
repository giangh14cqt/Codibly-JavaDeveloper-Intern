package src;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class BubleSortTest {

    @Test
    public void test1BubleSort() {
        double[] arr = { 1, 4, 5, 6, 8, 3, 8 };
        double[] expected = { 1, 3, 4, 5, 6, 8, 8 };
        double[] actual = BubleSort.sort(arr);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test2BubleSort() {
        double[] arr = { -9.3, 0.2, 4, 0.1, 5, 9 };
        double[] expected = { -9.3, 0.1, 0.2, 4, 5, 9 };
        double[] actual = BubleSort.sort(arr);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test3BubleSort() {
        double[] arr = {};
        double[] expected = {};
        double[] actual = BubleSort.sort(arr);
        assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test4BubleSort() {
    double[] arr = { 5.0001 };
    double[] expected = { 5.0001 };
    double[] actual = BubleSort.sort(arr);
    assertTrue(Arrays.equals(expected, actual));
    }

    @Test
    public void test5BubleSort() {
        double[] arr = null;
        try {
            BubleSort.sort(arr);
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }

    }

}
