public class Leetcode33 {
    public static boolean binarySearch(int[] arr, int target, int si, int ei){
        if(si > ei){
            return false;
        }
        
        int mid = si + (ei - si)/2;
        
        // found case
        if (arr[mid] == target) {
            return true;
        }

        // mid on line1
        if (arr[si] <= arr[mid]) {
            // case: a
            if (arr[si] <= target && target <= arr[mid]) {
                return binarySearch(arr, target, si, mid-1);
            }
            // case: b
            else{
                return binarySearch(arr, target, mid+1, ei);
            }
        }
        // mid on line2
        else{
            // case: c
            if (target <= arr[ei] && arr[mid] <= target) {
                return binarySearch(arr, target, mid+1, ei);
            }
            // case: d
            else{
                return binarySearch(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        // int[] arr = {4,5,6,7,0,1,2,3};
        int[] arr = {2,5,6,0,0,1,2};
        int target = 8;
        boolean ans = binarySearch(arr, target, 0, arr.length -1);
        System.out.println(ans);
    }
}