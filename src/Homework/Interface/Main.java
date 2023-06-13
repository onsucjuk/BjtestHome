package Homework.Interface;

public class Main {
    public static void main(String[] args) {
        Dog10 dog = new Dog10();
        Cat10 cat = new Cat10();

        System.out.println("Dog interface");
        dog.move();
        dog.bark();
        dog.eat();
        System.out.println();

        System.out.println("Cat interface");
        cat.move();
        cat.bark();
        cat.eat();

    }
}
