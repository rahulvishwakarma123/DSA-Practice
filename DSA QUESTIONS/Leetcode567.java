import java.util.Arrays;
import java.util.HashMap;

public class Leetcode567 {
    // public static boolean checkPermutation(String s1, String s2){
    //     int m = s1.length();
    //     int n = s2.length();
    //     if (n < m) {
    //         return false;
    //     }
    //     HashMap<Character, Integer> hm = new HashMap<>();

    //     // adding all the elements of s1 in the hashmap;
    //     for (int i = 0; i < m; i++) {
    //         char curr = s1.charAt(i);
    //         if(hm.containsKey(curr)){
    //             hm.replace(curr, hm.get(curr) + 1);
    //         }else{
    //             hm.put(curr, 1);
    //         }
    //     }
    //     // System.out.println(hm);


    //     for (int i = 0; i < n; i++) {
    //         char curr = s2.charAt(i);
    //         if (i + m <= n) {
    //             if (hm.containsKey(curr)) {
    //                 if (check(s2, hm, i, m)) {
    //                     return true;
    //                 }
    //             }
    //         }else{
    //             return false;
    //         }
    //     }
    //     return false;
    // }

    // public static boolean check(String s2, HashMap<Character, Integer> hm, int idx, int m){
    //     HashMap<Character, Integer> temp = new HashMap<>(hm);
    //     for (int i = idx; i < idx + m; i++) {
    //         char curr = s2.charAt(i);
    //         if(!temp.containsKey(curr)){
    //             System.out.println("false 1");
    //             return false;
    //         }
    //         else if(temp.containsKey(curr) && temp.get(curr) < 1){
    //             System.out.println("false 2");
    //             return false;
    //         }
    //         else if(temp.containsKey(curr) && temp.get(curr) > 0){
    //             temp.replace(curr, temp.get(curr) - 1);
    //         }
    //     }
    //     return true;
    // }


    // second approach - sliding window;
    public static boolean checkPermutation(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        if (n < m) {
            return false;
        }
        int[] firstArray = new int[26];
        int[] secondArray = new int[26];
        
        // First put all the elements of the first string into first array;
        for (int i = 0; i < m; i++) {
            firstArray[s1.charAt(i) - 'a']++;
        }

        // putting the element of first window
        for(int i = 0; i < m; i++){
            secondArray[s2.charAt(i) - 'a']++;
        }

        // checking the first window permutations
        if(Arrays.equals(firstArray, secondArray)) return true;

        // checking the elements to the next windows
        for(int i = m; i < n; i++){
            // removing the element of old window
            secondArray[s2.charAt(i-m) - 'a']--;

            // adding the element of new window
            secondArray[s2.charAt(i) - 'a']++;

            // checking the current window
            if(Arrays.equals(firstArray, secondArray)) return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkPermutation(s1, s2));

    }
}
