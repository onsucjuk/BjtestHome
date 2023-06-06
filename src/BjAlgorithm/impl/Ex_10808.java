package BjAlgorithm.impl;

import java.util.Scanner;

public class Ex_10808 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26]; // 알파뱃 숫자만큼 배열 선언

        for(int i =0; i < s.length(); i++){
            arr[s.charAt(i)-97] += 1;
        }
        // arr을 26개로 나눠서 각각 위치[a-97]에 등장횟수 저장

        for(int list : arr){
            System.out.print(list + " ");
        }
        //전체 출력
    }
}
