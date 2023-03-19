import java.util.Scanner;

public class Ex10871ver2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<a ; i++) {

            int c = sc.nextInt();

            if (c<b) {

                sb.append(c + " ");

            }

        }

        System.out.println(sb);

    }
}
