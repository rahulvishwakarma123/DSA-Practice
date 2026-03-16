public class Leetcode81 {

    public static boolean findElement(int[] arr, int target, int si, int ei){
        int pvt = findPvt(arr, si, ei);

        // if (pvt == -1) {
        //     return false;
        // }
        // search left from pvt index
        if (arr[ei] >= target && arr[pvt] <= target) {
            return binarySearch(arr, target, pvt, ei);
        }
        else{
            return binarySearch(arr, target, si, pvt - 1);
        }
    }
    public static int findPvt(int[] arr, int si, int ei){
        if (si == ei) {
            return si;
        }

        while (si < ei && arr[si] == arr[si + 1]) {
            si++;
        }
        while (si < ei && arr[ei] == arr[ei - 1]) {
            ei--;
        }
        // if (si == ei) {
        //     return -1;
        // }
        int mid = si + (ei - si) / 2;
        if(arr[mid] < arr[si]){
            return findPvt(arr, si, mid);
        }else{
            return findPvt(arr, mid, ei);
        }
    }
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
        int arr[] = {1,1,0,1,1,1};
        int arr1[] = {4,5,6,1,2,2,3,4};
        int arr2[] = {3,5,6,7,8,9};
        int arr3[] = {3,4,5,6,1,2};
        int[] arr4 = {1,1};
        boolean ans = findElement(arr4, 1, 0, arr4.length - 1);
        System.out.println(ans);
    }
}
