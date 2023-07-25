package Homework.Ex;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Ex23211 {

    // 배열 크기 n의 배열 만드는 메서드 생성
    static int[] mkArr (int a) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int num;
        int[] arr = new int[a];
        for(i = 0; i < arr.length; i++) {
            System.out.print("1~9까지의 숫자를 입력해주세요. " + (i + 1) + "번째 값 : " );
            num = sc.nextInt();
            if (num > 0 && num < 10) {
                arr[i] = num;
            } else {
                System.out.println("Error : 1~9까지의 숫자로 다시 입력해주세요");
                --i;
            }
        }
            return arr;
    }

    static void shiftArr(int[] arr, int num){
        //원래 배열 값
        System.out.print("새로 생성된 배열의 값은 ");

            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i]);

            System.out.println(" 입니다.");

            //왼쪽으로 한칸씩 시프트 후 0번자리 제일 마지막 출력 [재배치 된 배열 값]
            //문제의 조건
            //printf 활용해서 %d를 사용 후 , 이하 한줄만 사용 for문 사용하지 말것

            System.out.print("재배치 된 배열 값은 ");

            for (int i = 0; i < arr.length; i++)
                System.out.printf("%d", arr[(i + num) % arr.length]);

            System.out.print(" 입니다.");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력해주세요. : ");
        int length = sc.nextInt();
        int shift = 0;

        for(int i =0; i<1; i++) {
            System.out.print("왼쪽으로 쉬프트 할 크기를 입력해주세요. : ");
            shift = sc.nextInt();
            if(shift>=length){
                shift = 0;
                i--;
                System.out.println("쉬프트 크기를 알맞게 조정해주세요."+"0에서 "+length+"미만의 정수");
            }
        }

        shiftArr(mkArr(length), shift);
    }
}
