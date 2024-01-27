package basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberReverserTest {
    
    @Test
    public void testReverse() {
        assertEquals(4321, NumberReverser.reverse(1234));
        assertEquals(123456789, NumberReverser.reverse(987654321));
        assertEquals(-5432, NumberReverser.reverse(-2345));
        
    }
}
