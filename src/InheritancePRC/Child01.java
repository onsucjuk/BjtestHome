package InheritancePRC;

public class Child01 extends Parent01 {
    public Child01() {
        System.out.print("D");
    }

    @Override
    public void fn() {
        System.out.print("E");
    }

    public void fnB() {
        System.out.print("F");
    }
}
