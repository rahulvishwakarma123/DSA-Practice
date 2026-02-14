public class Leetcode53 {
// this is for the array which contains atleast one positive number.
    public static int kadansAlgo(int[] arr) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static int kadansAlgoNegative(int[] arr){
        int sum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = { -5, -4, -3, -2, -1 };
        int ans = kadansAlgoNegative(arr);
        System.out.println(ans);
    }
}
