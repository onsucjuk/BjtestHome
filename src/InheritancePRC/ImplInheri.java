package InheritancePRC;

import Homework.Inheritance.Parent;

public class ImplInheri {
    public static void main(String[] args) {
        Parent01 p = new Parent01();
        Child01 c = new Child01();
        Parent01 p1 = new Child01();

//        p.info();
        c.info();
        int a = 10;
        increase(a);
        System.out.println(a);
        System.out.println(increase(a));
    }

    static int increase(int n) {
        n += 1;
        return n;
    }
}
