import java.util.Scanner;

public class Main {

/*    public static String solution(int a) {

        if (a % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }

    }*/
    public static void main(String[] args) {



/*        String anw = solution(4);

        System.out.println(anw);*/

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num==0) {
            System.out.println("0");
        }
        else if(num%2==0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

    }

}