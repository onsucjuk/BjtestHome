import java.util.Scanner;

public class Ex3052ver2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 42;
        int b = 10;
        boolean bl;
        int count = 0;


        int[] arr = new int[10];

        for (int i = 0; i < b; i++) {

            arr[i] = sc.nextInt() % a;

        }

        for (int i = 0; i < b; i++) {

            bl = false;
            for (int j = i+1; j<b ; j++) {

                if(arr[i] == arr[j]) {

                    bl = true;
                    break;

                }
            }

            if (bl == false) {

                count ++;

            }
        }

        System.out.printf("%d",count);

    }

}
