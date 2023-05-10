package Homework;

public class Dog {
    private String name, kind;
    private int age;
    public Dog(){}
    public Dog(String name, String kind, int age) {

        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }
    public String bark() {
        return "bark!bowwow..!";
    }
}




