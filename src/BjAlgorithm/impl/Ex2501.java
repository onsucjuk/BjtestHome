package BjAlgorithm.impl;

import java.util.Scanner;

public class Ex2501 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = sc.nextInt();
        //약수의 순서
        int count = 0;
        //n 번째 약수
        int result = 0;

        // 약수 구하는 반복문
        for(int i = 1; i <= num; i++) {
            //약수마다 count++
            if(num % i == 0) {
                count++;
            }
            //count가 n과 같아지면 곧 그 약수가 n번째 약수란 뜻이기에 result에 저장 후 반복문 종료
            //n번째 약수가 없다면 초기 값 0 출력
            if(count == n) {
                result = i;
                break;
            }
        }
        System.out.println(num + "의 " + n + "번째 약수는 " + result + "이다.");
    }
}
