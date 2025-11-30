import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        // String a = "level";
        // String b = "rahul";
        boolean palindrom = true;
        for (int i = 0, j = a.length() - 1; i < j; j--, i++) {
            if (a.charAt(i) != a.charAt(j)) {
                System.out.println("String is not Palindrom");
                palindrom = false;
                break;
            }
        }
        if(palindrom) System.out.println("String is palindrom");
        sc.close();
    }
}