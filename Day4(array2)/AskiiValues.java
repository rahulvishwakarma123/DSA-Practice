import java.util.Scanner;

public class AskiiValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = s.charAt(0);
        int askiiValue = (int)c;
        System.out.println("ASKII Value of the Character is " + c + " is " + askiiValue);
    }
}
