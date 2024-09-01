package gptCodingTest;

public class Ex03 {

    public static void inverseString(String str) {

        String[] strArray = str.split("");
        int len = strArray.length;
        String[] rArray = new String[len];

        for(String s : strArray) {
            rArray[len-1] = s;
            len--;
        }

        for(String s : rArray) {
            System.out.print(s);
        }

    }

    public static void main(String[] args) {

        inverseString("world");

    }
}
