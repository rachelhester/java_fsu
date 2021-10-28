//Author: Rachel Hester
import java.util.Scanner;

public class Powers {
	public static void main (String args[])
	{
        //scanner object plus variable declarations
        Scanner scnr = new Scanner(System.in);
		long current = 1;
        long nextNum = 2;

        //input statement 
        System.out.print("Enter the upper limit: ");

        //user input into scanner 
        long upperLimit = scnr.nextInt();

        //print statement for current variable, the variable we're going to be using as the sum
        System.out.print(current);
        //beginning of do-while loop
        do {
            System.out.print("+" + nextNum); 
            current += nextNum; //sum math
            nextNum = nextNum * 2; //simple math to do powers of 2 
        } 
		while(current < upperLimit); { //this is our condition, the sum has to stay under that upperLimit 
			System.out.println("=" + current); //printing the sum once the condition fails
		}
		
	}//end of main 

	
}//end of class