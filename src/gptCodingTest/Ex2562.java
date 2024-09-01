package gptCodingTest;

import java.util.Scanner;

public class Ex2562 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int maxIdx = 0;


        for (int i = 1; i < 9; i++) {
            int number = sc.nextInt();
            if (number > max) {
                max = number;
                maxIdx = i;
            }
        }
        sc.close();

        System.out.println(max);
        System.out.println(maxIdx + 1);

    }

}
