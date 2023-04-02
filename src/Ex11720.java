import java.util.Scanner;

public class Ex11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        for(int i = 0; i < a; i++) {

            sum += s.charAt(i) - 48; // or -'0'

        }

        System.out.println(sum);

    }
}
