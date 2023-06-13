package Homework.Interface;

public class Dog10 implements Animal {

    @Override
    public void move() {
        System.out.println("슥슥~~");
    }

    @Override
    public void eat() {
        System.out.println("쩝쩝");
    }

    @Override
    public void bark() {
        System.out.println("멍멍!");
    }
}
