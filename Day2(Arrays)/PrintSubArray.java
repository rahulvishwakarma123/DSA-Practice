public class PrintSubArray {

    public static void printSubArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    if (j2 == i) {
                        System.out.print("(");
                    }
                    System.out.print(arr[j2] + ", ");
                    if (j2 == j) {
                        System.out.print("), ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        printSubArrays(arr);
    }
}