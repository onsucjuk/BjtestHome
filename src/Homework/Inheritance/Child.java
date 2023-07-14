package Homework.Inheritance;

public class Child extends Parent {
    public Child() {
        System.out.print("D");
    }
    public Child(int a){
        super(a);
        System.out.print("E");
    }
}
