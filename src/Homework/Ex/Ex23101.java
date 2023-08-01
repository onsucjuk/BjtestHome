package Homework.Ex;

class Static{
    public int a = 20;
    static int b = 0;
}
public class Ex23101 {
    public static void main(String[] args) {
        int a = 10;
        Static.b = a;
        Static st = new Static();

        System.out.println(Static.b++);
        System.out.println(st.b);
        System.out.println(a);
        System.out.println(st.a);
        //Static 클래스의 a는 public 이기 때문에 객체 선언 new를 해야 Static.a로 끌어 쓸 수 있음
        //Static 클래스의 b는 static 이기 때문에 따로 객체 선언을 하지 않아도 호출 가능
        // 그러므로 new로 객체 생성한 st의 경우 st.a 혹은 st.b로 호출 가능
    }


}
