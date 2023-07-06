package InheritancePRC;

public class ImplInheri {
    public static void main(String[] args) {
        Child01 c = new Child01();
        //Parent01 생성자에 "A"출력문 구현 System.out.print("A")
        //child01 생성자에 "D"출력문 구현

        // 생성자 생성만해도 위의 로직 구현해놨기 때문에
        // Parent -> Child 순으로 생성자 로직 실행
        // AD 출력 됌
    }
}
