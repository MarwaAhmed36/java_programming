package chapter10_polymorphism;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Woooof");
    }

    public void fetch(){
        System.out.println("fetch is fun");
    }
}
