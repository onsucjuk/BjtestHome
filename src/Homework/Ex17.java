package Homework;

public class Ex17 {

    static void align(int arr[], int l) {
        int temp;
        for (int i = 0 ; i < l-1; i++) {
            for(int j = 0; j < l-1-i; j++){
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a = {85, 75, 50, 100, 95};
        int l = a.length;

        align(a,l);
        for (int i = 0; i < l; i++){
            System.out.print(a[i]+" ");
        }
    }
}
