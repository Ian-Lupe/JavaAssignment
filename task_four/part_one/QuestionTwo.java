package part_one;

import java.util.Scanner; //importing Scanner

public class QuestionTwo {
   // static Scanner object
   static Scanner input = new Scanner(System.in);

   // A prime number is a number that is evenly divisible only by itself and 1
   static void isPrime() {

       System.out.println("Enter an integer number to check if it is prime or not: ");
       var numberToTest = input.nextInt();

       boolean flag = false;
       for (int i = 2; i <= numberToTest / 2; ++i) {
           // condition for nonprime number
           if (numberToTest % i == 0) {
               flag = true;
               break;
           }
       }

       if (!flag)
           System.out.println(numberToTest + " is a prime number.");
       else
           System.out.println(numberToTest + " is not a prime number.");

   }

   // [main] method that displays prime numbers between 1 to 100.
   public static void main(String[] args) {

       int i = 0;
       int myNumber = 0;
       // Empty String
       String primeNumbers = "";

       for (i = 1; i <= 100; i++) {
           int counter = 0;
           for (myNumber = i; myNumber >= 1; myNumber--) {
               if (i % myNumber == 0) {
                   counter = counter + 1;
               }
           }
           if (counter == 2) {
               // Appended the Prime number to the String
               primeNumbers = primeNumbers + i + " ";
           }
       }
       System.out.println("The prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);

       // calling the isPrime method in the main method
       isPrime();
   }
}