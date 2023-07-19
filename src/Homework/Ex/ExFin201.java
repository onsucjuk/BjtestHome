package Homework.Ex;

public class ExFin201 {
    public static void main(String[] args){
        int arr[];
        int i = 0;
        arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        //피보나치 수열 만들기
        int len = arr.length;
        while(i<len-2){
            arr[i+2] = arr[i] + arr[i+1];
            i++;
        }
        System.out.println(arr[len-1]);
    }
}
