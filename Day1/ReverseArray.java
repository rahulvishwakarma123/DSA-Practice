import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = { 1, 2, 3, 4, 5 };
        int arr[] = { 1, 2, 3, 4 };
        for(int i = 0, j = arr.length-1; i < j; j--, i++ ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
