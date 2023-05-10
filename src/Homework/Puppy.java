package Homework;
public class Puppy extends Dog {

    public Puppy(String name, String kind, int age) {
        super(name,kind,age);
    }

    @Override
    public String bark() {
        return "yip!yip!";
    }

}
