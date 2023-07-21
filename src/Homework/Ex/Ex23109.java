package Homework.Ex;

public class Ex23109 {
    public static void main(String[] args) {

        // 2진수 10진수 변환
        int input = 101110;
        int di = 1;
        int sum = 0;

        while(true){
            if (input == 0) break;
            else {
                sum += ((input %10) * di);
                di *= 2;
                input = input / 10;

            }
        }

        System.out.println("2진수 " + input + "을 십진수로 변환한 값 : " + sum);
    }
}
