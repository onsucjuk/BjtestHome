package Homework.Interface;

public class Cat10 implements Animal {

    @Override
    public void move() {
        System.out.println("사뿐사뿐~~");
    }

    @Override
    public void eat() {
        System.out.println("냠..냠");
    }

    @Override
    public void bark() {
        System.out.println("야옹~~");
    }
}
