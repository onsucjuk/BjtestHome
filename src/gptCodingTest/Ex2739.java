package gptCodingTest;

import java.util.Scanner;

public class Ex2739 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        sc.close();

        for(int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }

    }

}
