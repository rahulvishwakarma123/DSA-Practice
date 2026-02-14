public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        // base case
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        // devide
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        // merge
        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[(ei - si) + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k] = arr[i];
                i++;
                k++;
        }
        while(j <= ei){
            temp[k] = arr[j];
                j++;
                k++;
        }
        

        // coping the sorted arr to original arr
        i = si;
        for (int k2 = 0; k2 < temp.length; k2++) {
            arr[i] = temp[k2];
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,8,2,4,7};
        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
