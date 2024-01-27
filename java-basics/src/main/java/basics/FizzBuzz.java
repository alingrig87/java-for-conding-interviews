package basics;

public class FizzBuzz {
    public static String getString(int n) {
        // 1 2 Fizz
        // 1 + " " + 2 " " + "Fizz"
        String result = "";

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                result += "FizzBuzz";
            } else if(i % 3 == 0) {
                result += "Fizz";
            } else if(i % 5 == 0) {
                result += "Buzz";
            } else {
                result += i;
            }
            if(i < n) {
                result += " ";
            }
        }

        return result;
    }
}
