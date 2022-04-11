package chapter4_repetition_structures;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        //Initialize known values
        int hourRate = 15;
        int maxHours = 40;
        //Get inputs
        System.out.println("Enter the total worked hours:");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while (hoursWorked > maxHours){
            System.out.println("Invalid entry.Your hours must be between 1 and 40.Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate gross

        double gross = hourRate * hoursWorked;
        System.out.println("Gross pay: $"+ gross);
    }
}
