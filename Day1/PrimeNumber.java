import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                System.out.println("The number is not Prime");
                prime = false;
                break;
            }
        }
        if(prime) System.out.println("The numebr is Prime"); 
        sc.close();
    }
}
