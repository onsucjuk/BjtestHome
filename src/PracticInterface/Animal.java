package PracticInterface;

public interface Animal {
    public static final String name = "동물";

    public abstract void move();
    public abstract  void eat();
    public abstract void bark();

    // 껍데기만 선언
    // 인터페이스는 static, final로 생성할 수 있는 상수와 abstract로 생성할 수 있는 추상 메서드만 구현 가능.
}
