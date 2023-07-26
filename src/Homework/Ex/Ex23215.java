package Homework.Ex;

import java.util.Scanner;

public class Ex23215 {
    public static void main(String[] args) {
        //동전 구하기

        int money = 4620;
        int n;

        System.out.println(money+"원을 최소한의 동전과 지폐로 구성하자.");
        n = money/1000;
        System.out.println("필요한 천원 권은 " + n + "장이다.");

        n = (money%1000)/500;
        System.out.println("필요한 500원 동전은 " + n + "개이다.");

        n = (money%500)/100;
        System.out.println("필요한 100원 동전은 " + n + "개이다.");

        n = (money%100)/10;
        System.out.println("필요한 10원 동전은 " + n + "개이다.");

    }
}
