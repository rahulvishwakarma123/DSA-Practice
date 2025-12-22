import java.util.Scanner;

public class ScoreOfString {

    public static int scoreOfString(String s) {
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            sum += Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = scoreOfString(s);
        System.out.println("score of the String is : " + sum);
        
        
    }
}
