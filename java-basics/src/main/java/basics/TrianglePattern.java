package basics;

public class TrianglePattern {

    public static String getTriangleString(int rows) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                count++;
                result.append(count).append(" ");
            }
            result.append("\n");
        }
        
        return result.toString();
    }

    
    public static void main(String[] args) {
        System.out.println(getTriangleString(7));
    }



}
