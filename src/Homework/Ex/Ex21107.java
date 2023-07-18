package Homework.Ex;

import java.util.Arrays;

public class Ex21107 {
    public static void main(String[] args) {
        int[][]arr = new int[][]{{45,50,75},{89}};

        System.out.println("배열 arr[0] : " + Arrays.toString(arr[0]));
        // 배열 출력 : Arrays.toString() 사용
        System.out.println("배열 arr[0]의 길이 : " + arr[0].length);
        System.out.println("배열 arr[1]의 길이 : " + arr[1].length);
        System.out.println("배열 arr[0][0]의 값 : " + arr[0][0]);
    }
}
