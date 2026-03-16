import java.util.Stack;

public class Leetcode1910 {
    public static boolean check(Stack<Character> s, String part){
        int m = part.length();
        Stack<Character> temp = new Stack<>();
        temp.addAll(s);
        for(int i = m-1; i >= 0; i--){
            // System.out.println(part.charAt(i));
            if(temp.peek() != part.charAt(i)){
                return false;
            }
            temp.pop();
        }

        return true;
    }
    public static String removeOccurrences(String s, String part) {
        int n = s.length();
        int m = part.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char curr = s.charAt(i);
            st.push(curr);
            if(st.size() >= m){
                if(part.charAt(m - 1) == st.peek() && check(st, part)){
                    for(int j = m-1; j >= 0; j--){
                        System.out.println(j);
                        System.out.println(st.peek());
                        st.pop();
                    }
                }
            }
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            System.out.println(st.peek());
            res.append(st.pop());
        }
        res.reverse();
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(s, part));
    }
}
