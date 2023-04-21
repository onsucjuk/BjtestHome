import java.util.Scanner;

public class Ex_leapyear {
public static void main(String[] args){

               Scanner sc = new Scanner(System.in);
               int a = sc.nextInt();

                    if (((a%4==0) && (a%100!=0)) || (a%400==0)) {
                        // 윤년 조건 4,400으로 나눈 나머지 값이 0, 100의 나머지가 0이 아닐 떄

                        System.out.println(a+"년은 윤년입니다.");

                    } else {

                        System.out.println(a+"년은 윤년이 아닙니다.");
                    }
    }
}
