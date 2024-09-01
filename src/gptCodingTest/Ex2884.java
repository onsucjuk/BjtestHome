package gptCodingTest;
import java.util.Scanner;

public class Ex2884 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        if (num1==0) {
            if(num2 >= 45) {
                num2 -= 45;
            } else {
                num1 = 23;
                num2 = 60 + num2 - 45;
            }
        } else {
            if(num2 >= 45) {
                num2 -= 45;
            } else {
                num1 -= 1;
                num2 = 60 + num2 - 45;
            }
        }

        System.out.println(num1 + " " + num2);

    }


}
