package gptCodingTest;

import java.util.Scanner;

public class Ex10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        for(int i = 0; i < len; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num1 + num2);
        }

        sc.close();
    }

}
