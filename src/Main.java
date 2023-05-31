import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int hap = 0;

        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s,", ");

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            hap += arr[i];
        }

        for (int j = arr.length-1; j > 0 ; j--){
        for (int i = 0; i < j; i++) {
            int temp = arr[i];
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
            }
        }
        }

        int min = arr[0];
        int max = arr[arr.length-1];
        int avg = hap / arr.length;


/*        for(int i = 0; i < 5; i++) {

            int a = sc.nextInt();
            arr[i] = a;

        }*/

        System.out.println("가장 큰 값 : " + max + " / 가장 작은 값 : " + min + " / 평균 값 : " + avg);

    }
}