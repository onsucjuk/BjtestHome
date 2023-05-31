import java.util.Scanner;

public class Ex_scanmu35tiple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("입력값 : ");
        int a = sc.nextInt();
        System.out.println("출력결과");

        if (a%3==0 && a%5==0) {
            System.out.println("\"3의 배수와 5의 배수를 둘다 만족합니다.\"");
        } else if(a%3==0) {
            System.out.println("\"3의 배수입니다.\"");
        } else if(a%5==0) {
            System.out.println("\"5의 배수입니다.\"");
        }
    }
}
