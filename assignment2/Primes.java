
import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {

        //input statement
        System.out.print("Enter the upper limit: ");

        //scanner object declaration
        Scanner scnr = new Scanner(System.in);

        //input variable into scanner
        int max = scnr.nextInt();

        //array declaration, max length
        int primes[] = new int[max];
        int primeIndex = 0;

        for (int i = 2; i < max; i++) {
            int factors[] = new int[i];
            int factorIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors[factorIndex++] = j;
                }
            }
             if (factorIndex == 2) {
                 primes[primeIndex++] = i;
             }
        }
        System.out.println("The prime numbers are: ");
        System.out.print(primes[0]);
        for (int i = 1; i < primeIndex; i++) {
            System.out.print(", " + primes[i]);
        }
        System.out.println();
    }
}
