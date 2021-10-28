package assignment1;

//Author: Rachel Hester
//Class: CGS3416
//FSUID: rah18b

import java.util.Scanner;

public class Starbucks {

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

    //checks if the purchase Total is at least $5 or doesn't qualify for discount
    //discount doubles are changed into ints after math is complete so the formatting is correct for the output 
    if (purchaseTotal >= 5) {

        //if numPurchase is equal to 0, then discount is 5% 
        if (numPurchase == 0) {
            discount = 0.05; 
           
        }
        //if numPurchase is at least 1 but less than 6, discount is 10%
        else if ((numPurchase >= 1) && (numPurchase < 6)) {
            discount = 0.10;
            
        }
        //if numPurchase is at least 6 but less than 11, discount is 15%
        else if ((numPurchase >= 6) && (numPurchase < 11)) {
            discount = 0.15;
           
        }
        //if numPurchase is at least 11 but less than 16, discount is 20%
        else if ((numPurchase >= 11) && (numPurchase < 16)) {
            discount = 0.20;
            
        }
        //if numPurchase is at least 16 but less than 21, discount is 25%
        else if ((numPurchase >= 16) && (numPurchase < 21)) {
            discount = 0.25;
           
        }
        //if numPurchase is at least 21, discount is 30% 
        else if (numPurchase >= 21) {
            discount = 0.30;
        }
        //if you didn't enter a number that matches any of these, then you have entered an invalid number and your discount is 0  
        else {
            System.out.print("You entered an invalid number.");
            discount = 0;
        }
    }//end of nested if else-if
        //if you had numPurchase equal to a number less than 5, then you don't qualify for a discount at Starbucks
        else {
            discount = 0;
    }

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