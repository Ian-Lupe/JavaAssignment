package task_one;

//Scanner import
import java.util.Scanner;

public class Question1 {

    //main method
    public static void main(String[] args) {

        //Scanner object
        Scanner input = new Scanner(System.in);

        //My variables
        String surname, oddeven;
        int age, numCharacters;


        System.out.println("Enter your surname :");
        surname = input.nextLine(); // input the name
        


        System.out.println("Enter your age :");
        age = input.nextInt(); // input the age



        // Finding number of char in surname
        numCharacters = surname.length();



        
        //if the moduus of age by 2 is zero
        if (age % 2 == 0) {
            //age is even
            oddeven = "even";
        } else {
            //age is odd
            oddeven = "odd";
        }





        // Display output
        System.out.println("Your sir name has : " + numCharacters + " characters");
        System.out.println("Your current age is an " + oddeven + " number.");
    }
}