package basics;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void testFindMax() {
        int[] numbers = {4, 12, 33, 1, 67, 2, 0};
        assertEquals(67, Arrays.findMax(numbers));
    }

    @Test
    public void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Arrays.findMax(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArrayUsingAnnotation() {
        int[] numbers = {};
        Arrays.findMax(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullArray() {
        int[] numbers = null;
        Arrays.findMax(numbers);
    }

    @Test(expected = IllegalArgumentException.class) 
    public void testReverseWithNullArray(){

        int[] numbers = null;
        Arrays.reverse(numbers);
    }

    @Test
    public void testReverse() {
        int[] numbers = {1, 3, 5, 6};
        int[] excepted = {6, 5, 3, 1};
        Arrays.reverse(numbers);
        assertArrayEquals(excepted, numbers);
    }

}