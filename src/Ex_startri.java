import java.util.Scanner;

public class Ex_startri {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int p = a/2+1;

        for(int i = 1; i <= a; i++){
            if(i<=p){
                for(int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for(int j = 2*p-i; j > 0; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
