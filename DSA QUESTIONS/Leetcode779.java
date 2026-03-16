public class Leetcode779 {
    public static StringBuilder calculateString(int n){
        if (n <= 1) {
            StringBuilder newSb = new StringBuilder();
            newSb.append("0");
            return newSb;
        }

        StringBuilder sb = new StringBuilder();
        sb = calculateString(n - 1);
        StringBuilder newSb = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') {
                newSb.append("01");
            }else newSb.append("10");
        }
        return newSb;
    }
    public static int kthSymbol(int n, int k){
        if (n <= 0 || k <= 0) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        sb = calculateString(n);
        char symbol = sb.charAt(k-1);
        int sym =  symbol - '0';
        return sym;

    }
    public static void main(String[] args) {
        System.out.println(calculateString(2));
        System.out.println(kthSymbol(2, 2));
    }
}
