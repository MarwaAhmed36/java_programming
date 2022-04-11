package chapter2_fundamentals;

import java.util.Scanner;

public class MadLipsExercise {
    public static void main(String[] args){
        //1. Get The season of the year
        System.out.println("Enter the season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Get the cups number
        System.out.println("Enter the minimum cups number");
        int cupsNum = scanner.nextInt();

        //3. Get the adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        //4. Print
        System.out.println("On a " + adjective + " "+ season+" day, I drink a minimum of " +cupsNum+" cups of coffee.");

    }
}
