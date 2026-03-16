public class Leetcode214 {
    // public static String shortestPalindrom(String s){
    //     int n = s.length();
    //     StringBuilder rev = new StringBuilder(s);
    //     rev = rev.reverse();
    //     String reverse = rev.toString();
    //     System.out.println(reverse);
    //     int i = 0;
    //     while (i < n) {
    //         if (s.substring(0, n-i).contentEquals(reverse.substring(i))) {
    //             return rev.substring(0, i) + s;
    //         }
    //         i++;
    //     }
    //     return reverse.substring(0, n) + s;

    // }


    // calculating shortest palindrome using KMP
     public static void calculateLPS(String pat, int[] lps){
        int m = pat.length();
        int i = 0;
        lps[i] = 0;
        int length = 0;
        i++;
        while(i < m){
            if (pat.charAt(i) == pat.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            }else{
                if (length != 0) {
                    length = lps[length - 1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
    public static String shortestPalindrome(String s){
        int n = s.length();
        if(n <= 1){
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String rev = sb.toString();
        if(rev.equals(s)){
            return s;
        }
        String finalString = s + rev;
        int[] lps = new int[finalString.length()];
        calculateLPS(finalString, lps);
        return rev.substring(0, rev.length() - lps[lps.length - 1]) + s;

    }

    public static void main(String[] args) {
        String s = "aabba";
        // int n = s.length();
        // StringBuilder rev = new StringBuilder(s);
        // rev = rev.reverse();
        // String reverse = rev.toString();

        System.out.println(shortestPalindrome(s));
        // System.out.println(s.substring(0,n-1).contentEquals(reverse.substring(1)));
    }
}
