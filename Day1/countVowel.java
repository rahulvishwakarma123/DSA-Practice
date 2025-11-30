import java.util.Scanner;

public class countVowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you wantt to count the vowels - ");
        String s = sc.nextLine();
        int count = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in this String is = " + count);
        sc.close();
    }
}