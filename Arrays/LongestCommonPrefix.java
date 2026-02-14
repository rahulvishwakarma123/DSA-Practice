public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        return longestCommonPrefix(strs, 0, strs.length - 1);
    }

    private static String longestCommonPrefix(String[] strs, int left, int right) {
        if (left == right) {
            return strs[left];
        }

        int mid = (left + right) / 2;
        String leftLCP = longestCommonPrefix(strs, left, mid);
        String rightLCP = longestCommonPrefix(strs, mid + 1, right);

        return commonPrefix(leftLCP, rightLCP);
    }

    private static String commonPrefix(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, minLength);
    }

    public static void main(String[] args) {
        // Solution solution = new Solution();

        // Test Example 1
        String[] strs1 = { "bat", "bag", "bnk", "band" };
        System.out.println("Input: [\"bat\",\"bag\",\"bank\",\"band\"]");
        System.out.println("Output: \"" + longestCommonPrefix(strs1) + "\"");
        // Expected: "ba"

        // Test Example 2
        String[] strs2 = { "dance", "dag", "danger", "damage" };
        System.out.println("\nInput: [\"dance\",\"dag\",\"danger\",\"damage\"]");
        System.out.println("Output: \"" + longestCommonPrefix(strs2) + "\"");
        // Expected: "da"

        // Test edge cases
        String[] strs3 = { "flower", "flow", "flight" };
        System.out.println("\nInput: [\"flower\",\"flow\",\"flight\"]");
        System.out.println("Output: \"" + longestCommonPrefix(strs3) + "\"");
        // Expected: "fl"

        String[] strs4 = { "dog", "racecar", "car" };
        System.out.println("\nInput: [\"dog\",\"racecar\",\"car\"]");
        System.out.println("Output: \"" + longestCommonPrefix(strs4) + "\"");
        // Expected: ""
    }
}
