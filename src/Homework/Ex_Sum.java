package Homework;

public class Ex_Sum {
    public int calc(int val1, int val2){
        return val1 + val2;
    }
}
class Ex_Multi extends Ex_Sum { // extends 명령을 통한 Ex_Sum의 상속을 선언(Ex_Multi는 자식 클래스)
    @Override
    public int calc(int val1, int val2){ // val1+val2를 val1*val2로 오버라이딩
        return val1 * val2;
    }

    public static void main(String[] args){

        Ex_Sum sum = new Ex_Multi(); // 자동형 변환

        int multi = sum.calc(10,10); // 오버라이딩 된 val1 * val2 리턴
        System.out.println("10과 10의 곱은 " + multi + "입니다.");

    }
}




