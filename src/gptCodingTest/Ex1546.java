package gptCodingTest;

import java.util.Scanner;

public class Ex1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] intArray = new int[len];
        int max = sc.nextInt();
        intArray[0] = max;

        for(int i = 1; i < len; i++) {
            int temp = sc.nextInt();
            intArray[i] = temp;
            if(temp > max) {
                max = temp;
            }
        }

        System.out.println("max : " + max);
        sc.close();

        double sum = 0;
        for(int score : intArray){

            System.out.println("score : " + score);
            sum += (double) score / max * 100;

            System.out.println("sum : " + sum);
        }

        double avg = sum / len;

        System.out.println(avg);
    }

}
