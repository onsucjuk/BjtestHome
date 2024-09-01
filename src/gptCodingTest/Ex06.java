package gptCodingTest;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int len = sc.nextInt();

        for(int i = 0; i < len; i++) {

            sum += sc.nextInt();

        }

        System.out.println(sum);

    }

}