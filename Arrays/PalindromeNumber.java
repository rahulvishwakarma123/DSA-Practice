public class PalindromeNumber{
    public static boolean palindromeNumber(int n){
        String str = Integer.toString(n);
        int i = 0;
        int j = str.length() - 1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 12221;
        boolean res = palindromeNumber(n);
        
        System.out.println(res);


    }
}