import java.util.HashMap;

public class Leetcode76 {
    public static String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int l= 0;
        int r = 0;
        int sIdx = -1;
        HashMap<Character, Integer> hm = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int count = 0;

        // adding the characters of second string (t) to the hashmap for tracing them 
        for(int i = 0; i < m; i++){
            char curr = t.charAt(i);
            if(hm.containsKey(curr)){
                hm.replace(curr, hm.get(curr) + 1);
            }else{
                hm.put(curr, 1);
            }
        }

        while(r < n){
            char curr = s.charAt(r);
            if(hm.containsKey(curr)){
                if(hm.get(curr) > 0){
                    count++;
                }
                hm.replace(curr, hm.get(curr) - 1);
            }else{
                hm.put(curr, -1);
            }
            while( count == m){
                if(r-l+1 < minLength){
                    minLength = r-l+1;
                    sIdx = l;
                }
                hm.replace(s.charAt(l), hm.get(s.charAt(l)) + 1);
                if(hm.get(s.charAt(l)) > 0){
                    count--;
                }
                l++;
            }
            r++;
        }
        if(sIdx == -1){
            return "";
        }else{
           return s.substring(sIdx, sIdx + minLength);
        }
    }
    public static void main(String[] args) {
        String s = "abobecoacobanc";
        String t = "abc";
        System.out.println(minWindow(s, t));
    }
}
