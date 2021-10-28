//FSUID: rah18b
//class: CGS3416
import java.util.Scanner;

public class Palindromes {

    //boolean method isPalin
    public static boolean isPalin(String str) {
        str = str.replace(" ", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        //input statement
        System.out.print("Enter the number of strings: ");

        //scanner object declaration
        Scanner scnr = new Scanner(System.in);

        //input variable into scanner
        String[] stringArray = new String[scnr.nextInt()];

        //input statement
        System.out.println("Enter the strings: ");

        scnr.nextLine();
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scnr.nextLine();
        }
       
        String[] palindromes = new String[stringArray.length];
        int palinIndex = 0;

        for (int i = 0; i < stringArray.length; i++) {

            //added the call to isPalin in if statement
            if (isPalin(stringArray[i])) {
                palindromes[palinIndex++] = stringArray[i];
            }

        }

        System.out.print("\nThe palindromes are: ");

        System.out.print(palindromes[0]);

        for (int i = 1; i < palinIndex; i++) {
            System.out.print("; " + palindromes[i]);
        }
        System.out.println();
    }

}//end of class


