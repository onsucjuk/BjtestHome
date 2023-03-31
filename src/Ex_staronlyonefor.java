public class Ex_staronlyonefor {
    public static void main(String[] args) {

        int i, j;

        for (i = 1, j =0; i <= 5; j++) {

            if (i>j) {

                System.out.print("*");

            } else if(i==j) {

                j = -1;
                i++;
                System.out.println();

            }

        }

    }
}
