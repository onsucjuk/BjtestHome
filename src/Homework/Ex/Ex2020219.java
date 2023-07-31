package Homework.Ex;

class A1 {
    private int a;
    public A1() {
        System.out.println("A");
    }
    public A1(int a){
        System.out.println(a);
    }
    public void display() {
        System.out.println("a=" + a);
    }
}
class B1 extends A1 {
    public B1(){
        System.out.println("B");
    }
    public B1(int a) {
        super(a);
        super.display();
    }
}
public class Ex2020219 {

    public static void main(String[] args) {
        B1 ob = new B1();
        B1 obj = new B1(10);
    }
}
