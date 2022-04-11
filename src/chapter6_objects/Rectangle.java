package chapter6_objects;

public class Rectangle {
    private double length;
    private double width;


    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        setWidth(width);//or this way.these are alternative options
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public  double calculatePerimeter(){
        return ( 2* length) + ( 2* width);
    }

    public  double calculateArea(){
        return length * width;
    }
}
