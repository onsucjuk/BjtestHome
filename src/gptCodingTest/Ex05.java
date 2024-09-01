package gptCodingTest;

public class Ex05 {

    public static int sumRemainder(int number) {

        int sum = 0;

        for(int i = 1; i <= number; i++){

            int remainder = number%i;

            if(remainder==0){
                sum += i;
            }

        }

        return sum;

    }

    public static void main(String[] args) {

        int sum = sumRemainder(12);
        System.out.println(sum);
    }

}
