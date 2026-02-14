import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode15 {

    public static ArrayList<ArrayList<Integer>> threeSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int first = 0; first < arr.length; first++) {
            if (first > 0 && arr[first - 1] == arr[first]) {
                continue;
            }
            int second = first + 1;
            int third = n - 1;
            System.out.println(second);
            System.out.println(third);
            while (second < third && second < n - 1 && third > 1) {
                if (arr[second] + arr[third] == (target - arr[first])) {
                    while (second < third && arr[second] == arr[second + 1]) {
                        second++;
                    }
                    while (second < third && arr[third] == arr[third - 1]) {
                        third--;
                    }
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(arr[first]);
                    al.add(arr[second]);
                    al.add(arr[third]);
                    ans.add(al);
                    second++;
                    third--;
                }
                if (second < third && arr[second] + arr[third] < (target - arr[first])) {
                    second++;
                }
                if (second < third && arr[second] + arr[third] > (target - arr[first])) {
                    third--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = { 2, 4, 1, 5, 6, 3 };
        int arr[] = { -1, 0, 1, 2, -1, -4, 0, 2 };
        int target = 0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans = threeSum(arr, target);
        System.out.println(ans);
        // ans.forEach((n) -> {
        // n.forEach((element) ->{
        // System.out.println(element);
        // });
        // });
    }
}
