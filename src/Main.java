import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 42;
        int b = 10;
        int num = 0;

        int[] arr = new int[10];

        for (int i = 0; i < b; i++) {

            int c = sc.nextInt();
            arr[i] = c % a;

        }

        for (int j = 0; j < b; j++) { // 나머지가 0일 경우 처리해야됌.

            for (int k = 0; k < b; k++) {

                if (arr[j] == arr[k]) {

                    num++;

                }

            }

        }


        if (num == b) {

            System.out.println(num);

        } else if (num > b) {

            int diff = ((2 * b) - num);
            System.out.println(diff);

        }

    }
}

