package task_one;

//Sannner import
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        int enteredNum;

        System.out.println("Enter a number to test its divisibility :");
        enteredNum = input.nextInt();// getting user input

        // calling the test methods in the main function
        testing0(enteredNum);
        testing1(enteredNum);
        testing2(enteredNum);
        testing3(enteredNum);
        testing4(enteredNum);
        testing5(enteredNum);
        testing6(enteredNum);
        testing7(enteredNum);
        testing8(enteredNum);
        testing9(enteredNum);
    }


    //A list of my methods to check divisibility test.
    static void testing0(int num) {
        System.out.println(num + " cannot be divisible by 0.");
    }

    static void testing1(int num) {
        System.out.println(num + " is divisible by 1. Any number divided by 1 will give the number itself");
    }

    static void testing2(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is divisible by 2. All even number are divisible by 2.");
        } else {
            System.out.println(num + " is not divisible by 2. All odd number are not divisible by 2.");
        }
    }

    static void testing3(int num) {
        if ((num % 3) == 0) {
            System.out.println(num + " is divisible by 3");
        } else {
            System.out.println(num + " is not divisible by 3");
        }
    }

    static void testing4(int num) {
        if ((num % 4) == 0) {
            System.out.println(num + " is divisible by 4");
        } else {
            System.out.println(num + " is not divisible by 4");
        }
    }

    static void testing5(int num) {
if ((num % 5) == 0) {
            System.out.println(num + " is divisible by 5");
        } else {
            System.out.println(num + " is not divisible by 5");
        }
    }

    static void testing6(int num) {
        if ((num % 6) == 0) {
            System.out.println(num + " is divisible by 6");
        } else {
            System.out.println(num + " is not divisible by 6");
        }
    }

    static void testing7(int num) {
        if ((num % 7) == 0) {
            System.out.println(num + " is divisible by 7");
        } else {
            System.out.println(num + " is not divisible by 7");
        }
    }

    static void testing8(int num) {
        if ((num % 8) == 0) {
            System.out.println(num + " is divisible by 8");
        } else {
            System.out.println(num + " is not divisible by 8");
        }
    }

    static void testing9(int num) {
        if ((num % 9) == 0) {
            System.out.println(num + " is divisible by 9");
        } else {
            System.out.println(num + " is not divisible by 9");
        }
    }
}