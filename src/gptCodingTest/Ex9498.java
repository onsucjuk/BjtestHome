package gptCodingTest;
import java.util.Scanner;

public class Ex9498 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        sc.close();

        if(point>=90) {
            System.out.println("A");
        } else if (point>=80) {
            System.out.println("B");
        } else if (point >= 70) {
            System.out.println("C");
        } else if (point >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
