package Homework.Ex;

public class Ex23207 {
    public static void main(String[] args) {
        String str1 = "Programming"; // true or false
        String str2 = "Programming";
        String str3 = new String("Programming");

        // str1과 str2는 같은 변수 참조
        System.out.println(str1==str2);
        // new로 생성 '==' 비교 불가
        System.out.println(str1==str3);

        //equals는 문자열 자체 비교
        System.out.println(str1.equals(str3));
        System.out.print(str2.equals(str3));
    }
}
