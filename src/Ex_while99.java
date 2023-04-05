public class Ex_while99 {
    public static void main(String[] args) {

        int i = 1;
        int j = 2;

        while(i<10) {

            if (j <=9 && i<9) {

                System.out.printf("%d X %d = %2d ", j, i, j * i);
                i++;

            }

            if (i == 9) {

                System.out.printf("%d X %d = %2d", j, i, j * i);
                System.out.printf("\n");
                i= 1;
                j++;
            }
        }
    }
}
