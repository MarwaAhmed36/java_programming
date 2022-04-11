package chapter6_objects;

public class HomeAreaCalculator {

    public static void main(String args[]){
        /***
        * Rectangle 1 for room 1
        ***/

        Rectangle rome1= new Rectangle(30,75);
        double areaOfRome1 = rome1.calculateArea();
        Rectangle rome2= new Rectangle(30,75);
        double areaOfRome2 = rome2.calculateArea();

        double totalArea = areaOfRome1+areaOfRome2;

        System.out.println("Area of both rooms: " + totalArea);
    }

}
