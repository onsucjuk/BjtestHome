package Homework;

import java.util.HashSet;
import java.util.Scanner;

public class Ex_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 첫 줄에 기준 값의 갯수 제시해 줌

        HashSet<Integer> index = new HashSet<>();
        // 값의 포함 유무를 판단할 기준이 되는 값이므로 중복 값이 필요 없으므로 HashSet 활용

        for(int i = 0; i < num; i++){ // 기준 값의 갯수 만큼 반복문을 통해 숫자를 index 에 추가함
            int idx = sc.nextInt();
            index.add(idx);
        }

        int num2 = sc.nextInt(); // index에 포함되어있는지 여부를 확인할 숫자의 갯수

        for(int i = 0; i < num2; i++){
            int n = sc.nextInt();

            if(index.contains(n)) // 포함되어 있으면 1, 없으면 0 출력
                System.out.println(1);
              else
                System.out.println(0);
        }
    }
}
