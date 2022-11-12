package task_one;

import java.util.Scanner; //importing Scanner

public class Question2 {
  
    //main function
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //my Scanner object
            



        //my variables
        double unit1, unit2, unit3, unit4, unit5, average;
        


            System.out.println("To get your average marks for last semester ");
            //inputting the five units
            System.out.println("\nUnit 1 : ");
            unit1 = input.nextDouble();
            System.out.println("Unit 2 : ");
            unit2 = input.nextDouble();
            System.out.println("Unit 3 : ");
            unit3 = input.nextDouble();
            System.out.println("Unit 4 : ");
            unit4 = input.nextDouble();
            System.out.println("Unit 5 : ");
            unit5 = input.nextDouble();




            //finding rounded average mark by calling findAverage method
            average = findAverage(unit1, unit2, unit3, unit4, unit5);




            //Dispalying output
            System.out.println("\nAverage mark : " + average);
        }



    static double findAverage(double unit1, double unit2, double unit3, double unit4, double unit5) {
        



        //finding the average
        var myAverage = (unit1 + unit2 + unit3 + unit4 + unit5) / 5; 
        



        //rounding the average
        var roundAverage = Math.round(myAverage * 100.0) / 100.0; 
        return roundAverage;
    }
}