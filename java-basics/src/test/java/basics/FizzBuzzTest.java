package basics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("1 2 Fizz", FizzBuzz.getString(3));
        assertEquals("1 2 Fizz 4", FizzBuzz.getString(4));
        assertEquals("1 2 Fizz 4 Buzz", FizzBuzz.getString(5));
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", FizzBuzz.getString(15));
    }

}
