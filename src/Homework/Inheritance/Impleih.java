package Homework.Inheritance;

public class Impleih {
    public static void main(String[] args) {

        // 기본 생정자 2개는 생성자 메서드 출력
        // Parent "A"
        // Child "D"
        Parent a = new Child();
        Child b = new Child();

        // int파라미터 메서드는 int파라미터 메세드 출력
        // Child = super(a)["B"] "E"
        // 생성자 메서드 생략
        Child c = new Child(5);

        // 기대값 ADADBE
    }
}
