public class Leetcode75 {
    // QUICK SORT
    public static void quickSort(int arr[], int st, int end){
        if(st >= end){
            return;
        }
        // make two part and return the index of pivot
        int pvt = partition(arr, st, end);
        quickSort(arr, st, pvt -1); // call for left part
        quickSort(arr, pvt + 1, end);   // call for right part
    }

    public static int partition(int arr[], int st, int end){
        int pvt = arr[end];
        int i = st - 1;
        for (int j = st; j < end; j++) {
            if (arr[j] <= pvt) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pvt;
        arr[end] = arr[i];
        arr[i] = temp;
        return i;
    }


    public static void main(String[] args) {
        int[] arr = {0,2,1,2,1,0,0,2,1};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
