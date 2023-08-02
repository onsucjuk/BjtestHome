package BjAlgorithm.impl;

import java.util.Scanner;

public class Ex_10870 {
    // n번째(==num) 피보나치 수 구하는 메서드 생성
    static int fibo(int num){

        int i1 = 0;
        int i2 = 1;

        int res = 0;

        for(int i = 0; i <= num; i++){
            if(i==0){
                res = i1;
            } else if(i==1){
                res = i2;
            } else if(i>1) {
                res = i1+i2;
                i1 = i2;
                i2 = res;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 번째 피보나치 수를 출력 할까요? 값을 입력해주세요 : ");
        int num = sc.nextInt();

        System.out.println(fibo(num));
    }
}
