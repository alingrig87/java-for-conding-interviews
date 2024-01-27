package basics;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MapsTest {
    @Test
    public void testTwoSum() {
        int[] numbers = new int[]{2, 3, 5, 9, 1};
        assertArrayEquals(new int[]{0, 3}, Maps.findTwoSum(numbers, 11));
    }
}
