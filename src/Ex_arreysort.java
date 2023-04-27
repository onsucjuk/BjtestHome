import java.util.Arrays;
import java.util.Scanner;

public class Ex_arreysort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 30;
        int list = 28;

        int[] ls = new int[a];
        int[] Mm = new int[a - list];
        int num = 0;

        for (int i = 0; i < a; i++) {

            ls[i] = i + 1;

        }

        for (int s = 0; s < list; s++) {

            int b = sc.nextInt();

            for (int j = 0; j < a; j++) {

                if (ls[j] == b) {
                    ls[j] = 0;
                }

            }
        }

        for (int k = 0; k < a; k++) {

            if (ls[k] != 0) {
                Mm[num] = ls[k];
                num++;
            }

        }

        Arrays.sort(Mm);

        for (int p = 0; p < a - list; p++) {

            System.out.println(Mm[p]);

        }
    }
}
