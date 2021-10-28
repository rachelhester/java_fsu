//FSUID: rah18b
//class: CGS3416
import java.util.Scanner;

public class PaliPrimes {

    //boolean method isPalin
    public static boolean isPalin(int num) {
        String numStr = "" + num;
        String reversed = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversed = reversed + numStr.charAt(i);
        } 
        return numStr.equals(reversed);
    }
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
                //added the call to isPalin in if statement
                if (factorIndex == 2 && isPalin(i)) {
                primes[primeIndex++] = i;
                }
        }
        System.out.println("The palindrome primes are: ");
        System.out.print(primes[0]);
        for (int i = 1; i < primeIndex; i++) {
            System.out.print(" \n" + primes[i]);
        }
        System.out.println();
    }

}//end of class


