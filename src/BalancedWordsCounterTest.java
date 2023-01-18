package src;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BalancedWordsCounterTest {
    @Test
    public void test1BalancedWordsCounter() {
        String str = "aabbabcccba";
        int expected = 28;
        int actual = BalancedWordsCounter.count(str);
        assertTrue(expected == actual);
    }

    @Test
    public void test2BalancedWordsCounter() {
        String str = "";
        int expected = 0;
        int actual = BalancedWordsCounter.count(str);
        assertTrue(expected == actual);
    }

    @Test
    public void test3BalancedWordsCounter() {
        String str = "abababa1";
        int expected = 22;
        int actual = BalancedWordsCounter.count(str);
        assertTrue(expected == actual);
    }

    @Test
    public void test4BalancedWordsCounter() {
        try {
            BalancedWordsCounter.count(null);
        } catch (Exception e) {
            assertTrue(e instanceof RuntimeException);
        }
    }
}
