import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex_splitmaxmin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine()," ,");
        int[] arr = new int[5];
        int hap = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            hap += arr[i];
        }

        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                int temp = arr[j];
                if (arr[j] > arr[j+1]){
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int min = arr[0], max = arr[arr.length-1], avg = hap/(arr.length);

        System.out.print("가장 큰 값 : " + max + " / 가장 작은 값 : " + min + " / 평균 값 : " + avg);

    }
}
