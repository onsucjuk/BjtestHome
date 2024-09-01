package gptCodingTest;

import java.util.Scanner;

public class Ex2577 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int multi  = 1;
        for(int i = 0; i < 3; i++){
            multi *= sc.nextInt();
        }
        sc.close();

        String mul = String.valueOf(multi);
        String[] stringArray = mul.split("");

        int[] numberArray = new int[10];

        for(String str : stringArray) {

            for(int i = 0; i < 10; i++) {
                int temp = Integer.parseInt(str);
                if(temp == i) {
                    numberArray[i] += 1;
                    break;
                }
            }
        }

        for(int num : numberArray) {
            System.out.println(num);
        }
    }

}
