import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacciSeries(int first, int second) {
        int n = first + second;
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first);
        for (int i = 0; i <= n; i++) {
            if (n == 1) {
                break;
            }
            

        }
    }
}