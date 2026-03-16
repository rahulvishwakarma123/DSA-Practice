import java.util.Arrays;

public class Leetcode66 {

    // do solve this problem by yourself
     public int[] plusOne(int[] digits) {
        StringBuilder number = new StringBuilder();
        for(int digit : digits) {
            number.append(digit);
        }
        long convertedDigit = Long.parseLong(number.toString());
        convertedDigit = convertedDigit + 1;
        String result = Long.toString(convertedDigit);
        int[] arr = new int[result.length()];
        for(int i = 0; i < result.length(); i++) {
            arr[i] = Character.getNumericValue(result.charAt(i));
        }
        return arr;
    }
     
    public static void main(String[] args) {
        
    }
}
