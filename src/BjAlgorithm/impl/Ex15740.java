package BjAlgorithm.impl;

import java.util.Scanner;

public class Ex15740 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        String integers = sc.nextLine();

        String[] arr = integers.split(" ");

        int length = arr.length;

        int sum = 0;

        for(int i = 0; i < length; i++) {

            sum += Integer.parseInt(arr[i]);

        }

        System.out.print(sum);

    }
}
