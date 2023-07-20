package Homework.Ex;

public class Ex21117 {
    public static void main(String[] args){
        int i, j;
        // 0 ~ 5 까지의 합 출력
        for(j=0, i=0; i <= 5; i++){
            j += i;
            System.out.print(i);
            if(i == 5){
                System.out.print("=");
                System.out.println(j);
            } else {
                System.out.print("+");
            }
        }
    }
}
