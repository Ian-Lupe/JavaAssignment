package task_one;

import java.util.Scanner; //importing Scanner

public class Question5 {
    public static void main(String[] args) {

        // my variables
        Double num1 , num2, result; 
        char mathSign;

        Scanner input = new Scanner(System.in); //Scanner object

        
        System.out.println("Enter the first number");
        num1 = input.nextDouble(); //get first num

        
        System.out.println("Type one of these signs as your operator: +, -, *, or /, and hit Enter.");
        mathSign = input.next().charAt(0); //get operator

        // request the second number from the user
        System.out.println("Enter second number");
        num2 = input.nextDouble(); //get last num

        switch (mathSign) {

            // do the subtraction
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            // do the addition
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            // do the multiplication
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            // do the division
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Please try again.");
                break;
        }
    }
}