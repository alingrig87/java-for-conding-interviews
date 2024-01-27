package basics;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringsTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(Strings.isPalindrome("level"));
        assertTrue(Strings.isPalindrome("radar"));
    }

    @Test
    public void testIsNotPalindrome() {
        assertFalse(Strings.isPalindrome("test"));
        assertFalse(Strings.isPalindrome("hello"));
    }
}
