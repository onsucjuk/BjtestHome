package InheritancePRC;

public class Child01 extends Parent01 {

    String className = "Child Class";
    @Override
    public void info(){
        super.info();
        System.out.println(className);
    }

    @Override
    public void fn() {
        System.out.print("E");
    }

    public void fnB() {
        System.out.print("F");
    }
}
