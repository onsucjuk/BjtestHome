package gptCodingTest;

import java.util.Scanner;

public class Ex25304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int len = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < len; i++) {
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            sum += price*cnt;
        }

        sc.close();

        if(sum==total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}
