package gptCodingTest;

import java.util.Scanner;

public class Ex3052 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10];

        for(int i = 0; i < 10; i++) {
            int temp = sc.nextInt();
            intArray[i] = temp%42;
        }

    }


}
