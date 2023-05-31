import java.util.Scanner;
public class Ex_nonedup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int temp;
        int l = arr.length;

        for(int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < l-1; i++) {
            for (int j = 0; j < l-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if (arr[j]==arr[j+1]){
                    for (int k = j; k < l-1; k++){
                        arr[k] = arr[k+1];
                    }
                    l--;
                    j--;
                }
            }
        }
            for(int i = 0; i < l; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
