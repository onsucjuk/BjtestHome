import java.util.Scanner;

public class Ex_X_star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int ct = (l / 2);
        int s = 0;
        int count = 1;

        for (int i = 0; i < l && s <= l; i++) {

            if (s < ct) {

                if (i == s) {

                    System.out.print("*");

                } else if (i == l - s - 1) {

                    System.out.print("*");
                    s++;
                    i = -1;
                    System.out.println();

                } else {

                    System.out.print(" ");

                }

            } else if (s == ct) {

                if (i == ct) {

                    System.out.print("*");
                    System.out.println();
                    s++;
                    i = -1;

                } else if (i < ct) {

                    System.out.print(" ");

                }

            } else {

                if (i == ct -count) {

                    System.out.print("*");

                } else if (i == ct + count) {

                    System.out.print("*");
                    s++;
                    count++;
                    i = -1;
                    System.out.println();

                } else {

                    System.out.print(" ");

                }

            }
        }

    }
}
