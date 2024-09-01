package gptCodingTest;

public class Ex02 {

    public static int[] maxMin (int[] intArray) {

        int max = intArray[0];
        int min = intArray[0];

        int len = intArray.length;

        for(int i = 0; i < len; i++) {

            for(int j = i+1; j < len; j++) {

                int temp = intArray[j];

                if(temp >= max){
                    max = temp;
                }

                if(temp <= min) {
                    min = temp;
                }
            }
        }

        int[] array = {max, min};

        return array;

    }

    public static void main(String[] args) {

        int[] intArray = {-1,-2,-3,-4,-5};

        int[] array = maxMin(intArray);

        System.out.println("(" + array[0] + ", " +  array[1] + ")");

    }




}
