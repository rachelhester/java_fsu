//FSUID: rah18b
//Class: CGS3416
import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {
        //variables and Scanner declaration
        Scanner scnr = new Scanner(System.in);
        int[] nums = new int[10];
        double mean;
        double variance;
        double stddev;
        double sum = 0;

        System.out.print("Enter the 10 numbers: ");

        for(int i = 0; i < nums.length; i++) {
            nums[i] = scnr.nextInt();
        }
        //for loop to add each element in the array to get the sum
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        mean = sum / 10;
        System.out.printf("\nThe mean is : %.1f", mean);

        double newsum = 0;

        //for loop to go through each element of the array and then square them each and add to sum
        for (int i = 0; i < nums.length; i++) {
            newsum = newsum + (Math.pow((mean - nums[i]),2));
        } 
        
        //n-1 is the denominator, not n as shown in example on Assignment 4 pdf 
        //since there are only 10 numbers, you can use the length of our array: 10 and subtract 1 
        variance = newsum / (nums.length - 1);
        System.out.printf("\nThe variance is : %.2f", variance);
       
        stddev = Math.sqrt(variance);
        System.out.printf("\nThe standard deviation is : %.2f", stddev);
        System.out.println();


    }


    

}
