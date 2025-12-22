public class MinMax {

    // Find the minimum and max at lesser comparisions.
    public static void MinMax(int arr[], int startIndex, int min, int max) {
        if (startIndex + 1 >= arr.length) {
            System.out.println("Min value in the array is - " + min);
            System.out.println("Min value in the array is - " + max);
            return;
        }
        if (startIndex == 0) {
            if (arr.length % 2 == 0) { // if arr is even
                if (arr[startIndex] < arr[startIndex + 1]) {
                    max = arr[startIndex + 1];
                    min = arr[startIndex];
                } else {
                    max = arr[startIndex];
                    min = arr[startIndex + 1];
                }
            } else { // if arr is odd
                min = arr[startIndex];
                max = arr[startIndex];
            }
            MinMax(arr, startIndex + 2, min, max);
            return;
        }

        if (arr[startIndex] > arr[startIndex + 1]) {
            if (max < arr[startIndex]) {
                max = arr[startIndex];
            }
            if (min > arr[startIndex + 1]) {
                min = arr[startIndex + 1];
            }
        } else {
            if (max < arr[startIndex + 1]) {
                max = arr[startIndex + 1];
            }
            if (min > arr[startIndex]) {
                min = arr[startIndex];
            }
        }
        MinMax(arr, startIndex + 2, min, max);
        return;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 5, 2, 4, 3, 1 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        MinMax(arr, 0, min, max);

    }
}