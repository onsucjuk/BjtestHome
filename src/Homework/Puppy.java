package Homework;
public class Puppy extends Dog {

    public Puppy(String name, String kind, int age) {
        new Dog(name,kind,age);
    }

    @Override
    public String bark() {
        return "yip!yip!";
    }

}
