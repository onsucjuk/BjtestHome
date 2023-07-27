package Homework.Ex;

public class Ex23103 {
    public static void main(String[] args) {
        String s1 = "qwer";
        String s2 = "qwtety";


        // s1의 문자 s2에 등장한 만큼 표시
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    System.out.print(s2.charAt(j));
                }
            }
        }

    }
}
