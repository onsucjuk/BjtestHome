package practice.javatest;

public class StringMethod {
    public static void main(String[] args){
        String str = "IT CookBook. Java";

        // String 타입의 길이 String.length()
        int len = str.length();
        System.out.println("\""+str+"\""+"의 길이는 " + len + "입니다.");

        // 시작, 끝 글자 확인 String.startsWith("val"), String.endsWith("val")
        // 문자 앞과 끝에 소괄호'(', ')' 넣기

        if (!str.startsWith("(")) {
            System.out.print("(");
        }

        for(int i = 0; i < len; i++) {
            System.out.print(str.charAt(i));
        }

        if (!str.endsWith(")")){
            System.out.println(")");
        }

        String stridx = "Java를 공부하는 중, Java는 재밌어요~";

        // 특정 문자가 제일 먼저 나오는 위치 String.indexOf("val")
        // 특정 문자가 제일 마지막에 나오는 위치 String.lastIndexOf("val")
        System.out.print("\"" + stridx + "\"" +"에서 제일 처음 나오는 Java의 위치 ==> ");
        System.out.println(stridx.indexOf("Java"));
        System.out.print("\"" + stridx + "\"" +"에서 마지막에 나오는 Java의 위치 ==> ");
        System.out.println(stridx.lastIndexOf("Java"));

    }
}
