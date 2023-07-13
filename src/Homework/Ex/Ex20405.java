package Homework.Ex;

public class Ex20405 {
    public static void main(String[] args){
        int[] arr = new int[4];
        int i = 0, n = 10;

        //10을 2진수로 표현
        while( n > 0) {
            arr[i++] = n % 2;
            n /= 2;
        }

        for(int j = arr.length; j > 0; j--) {
            System.out.print(arr[j-1]);
        }
    }
}
