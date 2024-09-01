package BjAlgorithm.impl;

import java.util.Scanner;

public class Ex2525 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int plusTime = sc.nextInt();

        int nextHour = (hour + (plusTime/60) + (minute + plusTime%60)/60)%24;
        int nextMinute = (minute + plusTime%60)%60;

        System.out.print(nextHour+" "+nextMinute);

    }

}
