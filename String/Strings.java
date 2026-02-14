package String;

import java.util.Arrays;
import java.util.HashMap;

// java.utils.Array;
class Strings {

    private static int lengthOfLastString(String s){
        s = s.trim();
        String[] string = s.split(" ");
        for (String str : string) {
            System.out.println(str);
        }
        return string[string.length - 1].length();
    }

        public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        String maxSubString = "";
        String subString = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                subString = "";
                i = hm.get(c) + 1;
                hm.clear();
                continue;
            }
            subString = subString + c;
            System.out.println(subString);
            hm.put(c,i);
            if(subString.length() > maxSubString.length()){
                maxSubString = subString;
            }

            System.out.println("Iteration is  => " + i);
            System.out.println("M => " + maxSubString);
            System.out.println("S => " + subString);
            System.out.println("===============================>");
            i++;
        }
        return maxSubString.length();

    }

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        String s = "dvdf";
        // char[] ch = s.toCharArray();
        // System.out.println(ch);
    //     Arrays.sort(ch);
    //     String sortedString = new String(ch);
    //     hm.put(sortedString, s);
    //     System.out.println(ch);
    //    System.out.println(sortedString);


    // int res = lengthOfLastString(s);
    // System.out.println(res);

    System.out.println(lengthOfLongestSubstring(s));


    }
}