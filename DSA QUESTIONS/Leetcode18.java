import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Leetcode18 {

    // this code is written by me

    // public static List<List<Integer>> fourSum(int arr[], int target){
    // List<List<Integer>> ans = new ArrayList<>();
    // HashMap<List<Integer>, Boolean> hm = new HashMap<>();
    // int n = arr.length;
    // Arrays.sort(arr);
    // for (int first = 0; first < n - 3; first++) {
    // // if (first > 0 && arr[first] == arr[first + 1]) {
    // // continue;
    // // }
    // for (int second = first + 1; second < n - 2; second++) {
    // // if (arr[second] == arr[second + 1]) {
    // // continue;
    // // }
    // int low = second + 1;
    // int high = n - 1;
    // while (low < high) {
    // if (low < high && arr[first] + arr[second] + arr[low] + arr[high] < target) {
    // low++;
    // }
    // else if(low < high && arr[first] + arr[second] + arr[low] + arr[high] >
    // target) {
    // high--;
    // }
    // else{
    // // while (low < high && arr[low] == arr[low+1]) {
    // // low++;
    // // }
    // // while (low < high && arr[high] == arr[high - 1]) {
    // // high--;
    // // }
    // List<Integer> list = new ArrayList<>();
    // list.add(arr[first]);
    // list.add(arr[second]);
    // list.add(arr[low]);
    // list.add(arr[high]);
    // if (!hm.containsKey(list)) {
    // hm.put(list, true);
    // ans.add(list);
    // }
    // low++;
    // high--;
    // }
    // }
    // }
    // }
    // return ans;
    // }

    // this code after seeing the solutions.

    // public static List<List<Integer>> fourSum(int arr[], int target) {
    // List<List<Integer>> ans = new ArrayList<>();
    // int n = arr.length;
    // Arrays.sort(arr);
    // for (int first = 0; first < n - 3; first++) {
    // // avoid for duplicates for the first element
    // if (first > 0 && arr[first - 1] == arr[first]) {
    // continue;
    // }

    // // early termination if smallest possible sum > target
    // int min1 = arr[first] + arr[first + 1] + arr[first + 2] + arr[first + 3];
    // if (min1 > target) {
    // break;
    // }

    // // skip if largest possible sum < target
    // int max1 = arr[first] + arr[n - 1] + arr[n - 2] + arr[n - 3];
    // if (max1 < target) {
    // continue;
    // }

    // // loop for second
    // for (int second = first + 1; second < n - 2; second++) {
    // // avoid duplicates for second element
    // if (second > first + 1 && arr[second] == arr[second + 1]) {
    // continue;
    // }

    // // terminate if smallest possible sum > target
    // int min2 = arr[first] + arr[second] + arr[second + 1] + arr[second + 2];
    // if (min2 > target) {
    // break;
    // }

    // // skip if largest possible sum < target
    // int max2 = arr[first] + arr[second] + arr[n - 1] + arr[n - 2];
    // if (max2 < target) {
    // continue;
    // }

    // int low = second + 1;
    // int high = n - 1;
    // while (low < high) {
    // int sum = arr[first] + arr[second] + arr[low] + arr[high];
    // if (sum > target) {
    // high--;
    // }
    // else if (sum < target) {
    // low++;
    // }
    // else{
    // ans.add(Arrays.asList(arr[first], arr[second], arr[low], arr[high]));

    // // skip duplicates for low
    // while (low < high && arr[low] == arr[low+1]) {
    // low++;
    // }

    // // skip duplicates for high
    // while (low < high && arr[high] == arr[high - 1]) {
    // high--;
    // }

    // low++;
    // high--;
    // }
    // }
    // }
    // }
    // return ans;
    // }

    // this is the code given by the AI

    public static List<List<Integer>> fourSum(int arr[], int target) {
    List<List<Integer>> ans = new ArrayList<>();
    int n = arr.length;
    Arrays.sort(arr);
    long longTarget = target; // Convert to long at start
    
    for (int first = 0; first < n - 3; first++) {
        if (first > 0 && arr[first] == arr[first - 1]) continue;
        
        for (int second = first + 1; second < n - 2; second++) {
            if (second > first + 1 && arr[second] == arr[second - 1]) continue;
            
            int low = second + 1;
            int high = n - 1;
            
            while (low < high) {
                // Use long to prevent overflow
                long sum = (long)arr[first] + (long)arr[second] + (long)arr[low] + (long)arr[high];
                
                if (sum < longTarget) {
                    low++;
                } else if (sum > longTarget) {
                    high--;
                } else {
                    ans.add(Arrays.asList(arr[first], arr[second], arr[low], arr[high]));
                    
                    while (low < high && arr[low] == arr[low + 1]) low++;
                    while (low < high && arr[high] == arr[high - 1]) high--;
                    
                    low++;
                    high--;
                }
            }
        }
    }
    return ans;
}
    public static void main(String[] args) {
        // int[] arr = { 1, 0, -1, 0, 2, -2 };
        int[] arr = {2,2,2,2,2,2};
        int arr2[] = {1000000000,1000000000,1000000000,1000000000};
        int target1 = -294967296;
        int target = 8;
        List<List<Integer>> ans = fourSum(arr, target);
        System.out.println(ans);
    }
}
