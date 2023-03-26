import java.util.Scanner;

public class Ex3052ver3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 42;
        int b = 10;
        int num = 0;
        int count = 0;

        int[] arr = new int[10];

        for (int i = 0; i < b; i++) {

            int c = sc.nextInt();
            arr[i] = c % a;

        }

        for (int j = 0; j < b; j++) {

            for (int k = j+1; k < b; k++) {

                if (arr[j] == arr[k]) {

                    num++;

                }

            }

            if (num==0) {

                count++;

            } else {

                num = 0;

            }
        }

        System.out.println(count);

    }
}
