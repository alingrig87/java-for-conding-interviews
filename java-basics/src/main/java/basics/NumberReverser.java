package basics;

public class NumberReverser {
    public static int reverse(int number) {
        int reversed = 0;

        while(number != 0) {
            int lastDigit = number % 10; // 1234 --> 4
            // 123
            // 3 -> 32 -> 321
            reversed = reversed * 10 + lastDigit;
            number = number / 10; // 1234 --> 123
        }

        return reversed;
    }
}
