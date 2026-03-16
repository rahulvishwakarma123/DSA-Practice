public class Leetcode151 {
    public static String reverseWordsOfString(String s){
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                StringBuilder word = new StringBuilder();
                while (i >= 0 && s.charAt(i) != ' ') {
                    word.append(s.charAt(i));
                    i--;
                }
                word = word.reverse();
                word = word.insert(0, ' ');
                res.append(word);
            }
        }

        String ans = res.toString();
        return ans.substring(1);
    }

    
    public static void main(String[] args) {
        String s = "a   v";
        System.out.println(reverseWordsOfString(s));
    }
}
