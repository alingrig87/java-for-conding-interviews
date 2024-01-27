package basics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TrianglePatternTest {
    
    @Test
    public void testGetTriangle() {
        assertEquals("1 \n2 3 \n4 5 6 \n7 8 9 10 \n", TrianglePattern.getTriangleString(4));
    }

    @Test
    public void extraSpaceOutput() {
        assertNotEquals("1 \n2 3 \n4 5 6 \n7 8 9 10 \n11 12 13 14 15 \n16 17 18 19 20 21 \n ", TrianglePattern.getTriangleString(6));
    }
}
