public class MaxSubarraySum {

    public static void maxSumArraySum(int arr[]){ // O(n^3)
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                currSum = 0;
            }
        }
        System.out.println("Your max sum: " + maxSum);
    }


    // Max sum using prefix array 
    public static void prefixSum(int arr[]){
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];
        int maxSum = Integer.MIN_VALUE;
        int currSum = Integer.MIN_VALUE;

        // calculating the prefix arry elements
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }

        // calculating the max sub array sum
        // for (int i = 0; i < arr.length; i++) {
        //     int start
        // }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,-6};
        // int arr3[] = {}
        maxSumArraySum(arr);
    }
}
