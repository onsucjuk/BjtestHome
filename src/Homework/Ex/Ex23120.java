package Homework.Ex;

class Parent {
    int x = 100;
    Parent() {
        this(500);
        // Parent(500)을 호출한다는 의미
    }
    Parent(int x) {
        this.x =x;
    }
    // x 가 100 -> 500으로 변경

    int getX() {
        return x;
    }
}

class Child extends Parent {
    int x = 4000;
    Child() {
        this(5000);
        // Child(5000)을 호출한다는 의미
    }

    Child(int x) {
        this.x = x;
    }
    // x 가 4000 -> 5000 으로 변경
}
public class Ex23120 {
    public static void main(String[] args) {
        Child obj = new Child();
        // 기본 생성자 부모 this(500), 자식 this(5000) 실행
        System.out.println(obj.getX());
        // 자식 클래스에 getX()메서드 없으므로 부모 클래스서 실행
        // 부모 클래스 x 값을 return
        // 500
    }
}
