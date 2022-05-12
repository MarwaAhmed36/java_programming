package chapter9_inheritance;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
}
