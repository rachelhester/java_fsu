package assignment1;

//Author: Rachel Hester
//Class: CGS3416
//FSUID: rah18b

import java.util.Scanner;

public class StarbucksTernary {

	public static void main (String args[])
	{
        //declare variables
        String name;
        double purchaseTotal;
        int numPurchase;
        double discount; 
        double moneySaved;
        double amountDue;
        double discountFormat;

        //create scanner object 
		Scanner scnr = new Scanner(System.in);

		//Prompts the user to enter things
		System.out.println("Welcome to Starbucks.");
        System.out.print("Please enter your name: ");
        name = scnr.nextLine();
        System.out.print("Please enter the current purchase amount: ");
        purchaseTotal = scnr.nextDouble();
        System.out.print("Please enter the number of purchases in the last month: ");
        numPurchase = scnr.nextInt();
        System.out.println("*********************************");

        discount = (purchaseTotal >= 5) ? (numPurchase == 0) ? 0.05 : (numPurchase >= 1 && numPurchase < 6) ? 0.10 : (numPurchase >= 6 && numPurchase < 11) ? 0.15 : (numPurchase >= 11 && numPurchase < 16) ? 0.20 : (numPurchase >= 16 && numPurchase < 21) ? 0.25 : 0.3 : 0;

        //math to determine how much money is saved using the discount: moneySaved and 
        //math to subtract discount from purchaseTotal to find the amountDue
        moneySaved = purchaseTotal * discount;
        amountDue = purchaseTotal - moneySaved; 

        //math to convert double discount decimal into integer format for output
        //typecast to int after math using discount variable has already completed
        discountFormat = (discount * 100);
        int discountFormatFinal = (int) discountFormat;

        //output statements using correct formatting for each variable
        System.out.println("Receipt for " + name);
        System.out.println("You get a " + discountFormatFinal + "% discount.");
        System.out.printf("Total amount due: $ %.2f\n", amountDue);
        System.out.printf("You saved: $ %.2f\n", moneySaved);
        System.out.println("*********************************");
    
    


		
	}//end of main 
	
}//end of class