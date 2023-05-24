package PracticInterface.interfaceImple;

import PracticInterface.Animal;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("사뿐사뿐~");
    }

    @Override
    public void eat() {
        System.out.println("냠냠..");
    }

    @Override
    public void bark() {
        System.out.println("멍멍!");
    }
}
