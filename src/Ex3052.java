import java.util.Scanner;

public class Ex3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 42;
        int b = 10;
        int num;
        int count = 0;
        int zero = 0;

        int[] arr = new int[10];

        for (int i = 0; i < b; i++) {

            int c = sc.nextInt();
            arr[i] = c % a;

        }

        for (int j = 0; j < b; j++) {

            num = 0;

            if (arr[j] != 0) {


                for (int k = 0; k < b; k++) {

                    if ((arr[j] == arr[k]) && num == 0) {

                        num++;
                        count++;

                    } else if ((arr[j] == arr[k]) && num == 1) {

                        arr[k] = 0;

                    }

                }


            } else if (arr[j] == 0) {

                zero = 1;

            }
        }

        System.out.println(count + zero);

    }
}
