public class KMP{
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
    public static void main(String[] args) {
        String pattern = "ababab";
        int[] lps = new int[pattern.length()];
        calculateLPS(pattern, lps);
        for (int i =0; i < lps.length; i++){
            System.out.println(lps[i]);
        }
        int n = lps.length;

        if (lps[n-1] == 0) System.out.println("empty");
        else System.out.println(pattern.substring(0, lps[lps.length - 1]));
    }
}