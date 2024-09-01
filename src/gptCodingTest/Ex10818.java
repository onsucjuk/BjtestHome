package gptCodingTest;

import java.util.Scanner;

public class Ex10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt()-1;
        int first = sc.nextInt();
        int max = first;
        int min = first;

        for(int i = 0; i < len; i++) {
            int number = sc.nextInt();
            if(number>max){
                max = number;
            }
            if(number < min) {
                min = number;
            }
        }

        sc.close();

        System.out.println(min + " " + max);
    }

}
