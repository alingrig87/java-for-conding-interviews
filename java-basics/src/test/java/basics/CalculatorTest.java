package basics;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    public static Stream<Object[]> dataProviderForAdd() {
        return Stream.of(
                new Object[]{1, 2, 3},
                new Object[]{2, 4, 6},
                new Object[]{-1, 1, 0},
                new Object[]{11, 2, 13}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProviderForAdd")
    public void testAddWithDataProviders(int a, int b, int excepted) {
        assertEquals(excepted, Calculator.add(a,b));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, Calculator.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }

}