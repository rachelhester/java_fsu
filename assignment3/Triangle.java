//FSUID: rah18b
//Class: CGS3416
import java.util.Scanner;

public class Triangle {
    
    public static void printTriangle(int num) {
        for (int i = 0; i < num; i++) {

            for(int j = 0; j < num - (i + 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = scnr.nextInt();

        if (num > 0) {
            printTriangle(num);

        }//end if 
        else {
            System.out.println("Number of lines is negative. Exiting.");
        }//end else
    }//end main

}//end class 
