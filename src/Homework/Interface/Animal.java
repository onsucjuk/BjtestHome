package Homework.Interface;

public interface Animal {

    // 인터페이스는 static, final로 생성할 수 있는 상수와 abstract로 생성할 수 있는 추상 메서드만

    public static final String name = "동물";
    // 상수 선언

    public abstract void move();
    public abstract void eat();
    public abstract void bark();
    // abstract로 생성한 추상 메서드

}
