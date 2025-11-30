public class PrintNumberInDecreasingOrder {

    // This is the program to print the n numbers from n in decreasing order 
    public static void decreasingOrder(int n){
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.err.println(n);
        decreasingOrder(n-1);
    }
    // This is the program to print the n numbers from 0 to n in increasing order 
    public static void increasingOrder(int n){
        if (n == 0) {
            System.out.println(n);
            return;
        }
        increasingOrder(n-1);
        System.err.println(n);
    }
    public static void main(String[] args) {
        int n = 10;
        increasingOrder(n);
    }
}
