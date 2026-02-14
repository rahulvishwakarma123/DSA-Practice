public class Leetcode11 {

    public static int mostWater(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int currWater = 0;
        int mostWater = 0;
        while (i < j) {
            int height = Math.min(arr[i], arr[j]);
            int width = j - i;
            currWater = height * width;
            mostWater = Math.max(mostWater, currWater);
            if (arr[i] < arr[j]) {
                i++;
            } else if (arr[i] > arr[j]) {
                j--;
            } else {
                if (arr[i + 1] > arr[j - 1]) {
                    i++;
                }else{
                    j--;
                }
            }
        }
        return mostWater;
    }

    public static void main(String[] args) {

        // int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        // int[] height = { 5,5,5,5,5 };
        // int[] height = { 1,2,5,2,1 };
        // int[] height = { 5,2,1,2,5 };
        int[] height = { 1,3,2,4,1,5,2,6 };
        int ans = mostWater(height);
        System.out.println(ans);
    }
}
