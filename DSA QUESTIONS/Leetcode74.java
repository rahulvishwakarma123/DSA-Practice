public class Leetcode74 {
    // search in 2D matrix
    public static boolean binarySearch(int[][] arr, int target){
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j >= 0 ) {
            // target > elem
            if(arr[i][j] < target){
                i++;
            }
            // target < elem
            else if(arr[i][j] > target){
                j--;
            }
            // target == elem
            else if (arr[i][j] == target){
                return true;
            }
        }
        // target not found
        return false;
    }
    public static void main(String[] args) {
        // int arr[][] = {
        //     {1,3,5,7},
        //     {10,11,16,20},
        //     {23,30,34,60}
        // };
        int arr[][] = {
            {0}
        };
        int target = 0;
        boolean ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
