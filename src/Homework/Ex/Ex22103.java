package Homework.Ex;

public class Ex22103 {
    // Class A {
    // int a, b;
    // } <<= 로 선언되어있음
    static void func1(A m) {
        m.a *= 10;
    }
    static void func2(A m){
        m.a += m.b;
    }
    // static 으로 메모리에 올라가 있음
    // 변수값 변경시 반영

    public static void main(String[] args){
        A m = new A();
        m.a = 100;
        func1(m);
        // m.a = 100 * 10

        m.b = m.a;
        // A의 변수 m의 int b 의 값은 int a의 값 반영(1000)
        func2(m);
        // m.a += 1000;
        // 1000+1000 = 2000

        System.out.println(m.a);
    }
}
