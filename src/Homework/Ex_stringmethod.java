package Homework;

import java.util.Scanner;

public class Ex_stringmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 변경을 입력해주세요. : ");
        String s = sc.nextLine();
        System.out.print("공백 제거만을 위한 문자도 입력해보세요. : ");
        String s4 = sc.nextLine();

        System.out.println("문자열 변경 테스트 시작합니다.");
        System.out.print("먼저 ()가 없다면 추가해드릴게요. ==> ");

        if (!s.startsWith("("))
            // 문자열 메소드 startsWith 시작 문자와 동일한지 여부 반환(true or false)
            // !(true false를 반대로)
            System.out.print("(");


        for (int i = 0; i < s.length(); i++) { // length메소드로 문자열의 길이만큼 출력(문자열을 문자로)
            // 그냥 print로 s출력해도 되지만 charAt()활용해서 출력
            // 대신 타입은 String문자열 타입이 아니라 char타입으로 변환됌
            System.out.print(s.charAt(i));
        }

        if (!s.endsWith(")"))
            // 문자열 메소드 endsWith 마지막 문자와 동일한지 여부 반환(true or false)
            // !(true false를 반대로)
            System.out.println(")\n");
    //-------------------------------------------------------------------------------------

        System.out.print("검색할 문자를 입력해주세요. : ");
        String s1 = sc.nextLine();
        // 앞서 입력한 문자에서 위치 검색할 문자열 입력
        System.out.print("검색 문자의 소문자 처음 위치는 ==> ");
        System.out.println(s.indexOf(s1.toLowerCase())+"번째 위치 입니다.");
        // 문자열 메소드 indexOf("검색문자열") 검색 문자열의 첫번째 위치 값 반환 당연히 대소문자 구별(0부터 시작)
        // 소문자로 검색
        System.out.print("검색 문자의 대문자 마지막 위치는 ==> ");
        System.out.println(s.lastIndexOf(s1.toUpperCase())+"번째 위치 입니다.\n");
        // 대문자로 검색

    //-------------------------------------------------------------------------------------

        System.out.print("변환할 문자의 위치을 입력해주세요.(숫자 \" \" 기준 입력) : ");
        int i1 = sc.nextInt(), i2 = sc.nextInt(); // 출력할 문자열의 위치를 입력(substring메서드 활용을 위해서)
        String s2 = s.substring(i1,i2);//substring을 활용해서 앞에 선언한 시작위치~마지막위치 문자열 s2에 반환

        System.out.print("문자열을 원하시는 문자열로 변환합니다. ==> ");
        System.out.println(s.replaceAll(s2,"va"));
        // 변환될 문자열 s2를 원하는 문자열로 변환
        // replace는 문자열을 변환해주고 replaceAll은 변환 입력 값에 문자열 뿐만 아니라 정규식을 써도 변환해 줌

        System.out.print("replaceAll의 정규식 사용 예[amA] : ");
        System.out.println(s.replaceAll("[amA]","*")+"\n");
        //정규식에 입력된 문자열(a,m,A)들을 *로 출력한다
    // -------------------------------------------------------------------------------------

        System.out.println("공백 제거 테스트 시작합니다.");
        System.out.println("먼저 양옆의 공백을 제거해보겠습니다. ==> " + s4.trim());
        // 모든 공백을 제거하고싶으면 if문을 써서 chatAt(i) != ' '면 charAt을 출력하라고하면 공백없이 출력 됌
        // 해당 위치의 값이 공백이 아니라면 문자 출력 (공백 제거)
        System.out.print("공백을 모두 제거해보겠습니다.! ==> ");
        for(int i = 0; i < s4.length(); i++){
            if(s4.charAt(i) != ' '){
                System.out.print(s4.charAt(i));
            }
        }
        System.out.println();

    }
}
