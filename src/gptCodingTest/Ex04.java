package gptCodingTest;

public class Ex04 {

    public static void sumNumber(int num) {


        int sum = 0;

       while(num > 0) {

                sum += num%10;
                num /= 10;

        }

        System.out.println(sum);

    }

    public static void main(String[] args) {

        sumNumber(1234);

    }

}
