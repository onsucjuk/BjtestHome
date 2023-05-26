package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ex_2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> hash = new HashSet<>();
        // 중복 제거로 정수를 받기 위해 hashset 사용

        int num = sc.nextInt();
        // 첫 줄에 제시된 숫자가 스캔할 정수의 수(라인 수)

        for(int i = 0; i < num; i++) {
            // 스캔 할 횟수(num) 만큼 반복하는 for문
            int number = sc.nextInt();
            hash.add(number);
        }

        ArrayList<Integer> arr = new ArrayList<>(hash);
        // hash set을 정렬하기 위해 ArrayList에 저장

        Collections.sort(arr);
        // Collections의 메소드를 활용하여 ArrayList 정렬(default = 오름차순)

        for(Integer i : arr){
            System.out.println(i);
        }

        sc.close();
        // sc닫음
    }
}
