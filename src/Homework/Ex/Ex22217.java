package Homework.Ex;

public class Ex22217 {
    int a;
    public Ex22217(int a) {
        this.a = a;
    }

    int func() {
        int b = 1;
        for (int i = 1; i < a; i++) {
            b = a * i + b;
        }
        return a + b;
    }

    public static void main(String[] args) {

        //obj의 a 값 = 3 (this.a = 3)
        Ex22217 obj = new Ex22217(3);

        //obj의 a 값 5로 바꿈
        obj.a = 5;

        // func 실행
        int res = obj.func();

        System.out.println(res);

    }
}
