
import java.util.Scanner;

public class Evaluator {
    //my methods for adding, subtracting, dividing, multiplying, and modulus calculation

    public static int add(int lhs, int rhs) {
        return lhs + rhs;
    }
    public static int subtract(int lhs, int rhs) {
        return lhs - rhs;
    }
    public static int divide(int lhs, int rhs) {
        return lhs / rhs;
    }
    public static int multiply(int lhs, int rhs) {
        return lhs * rhs;
    }
    public static int modulus(int lhs, int rhs) {
        return lhs % rhs;
    }
    //main method
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int num = 0;
        char op = '?'; 
        //input statement
        System.out.println("Enter the expression: ");

        //declaration of scanner object and variables
        int result = scnr.nextInt();
        
        //while operator is not a . because we need it to keep looping until it is 
        while(op != '.') {
            op = scnr.next().charAt(0);

            if(op != '.') { 
                num = scnr.nextInt();
            }
            switch(op) {
                case '+':
                    result = add(result, num);
                    break;
                case '-':
                    result = subtract(result, num);
                    break;
                case '/':
                    result = divide(result, num);
                    break;
                case '*':
                    result = multiply(result, num);
                    break;
                case '%':
                    result = modulus(result, num);
                    break;
            }
        }
        System.out.println("The result is: " + result);
    }
}
