package Homework;

import java.util.ArrayList;

public class Pt_StringBuilder {
    public static void main(String[] args){

        StringBuilder stb = new StringBuilder();
        // 글자와 글자를 이어줌
        // 기존 String은 하나의 문자열을 다른 문자열과 연결하면 새 문자열이 생성되고 이전 문자열은 가비지 컬렉터로 들어간다.
        // StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업 시 하나의 대안이 될 수 있다.

        ArrayList<String> list = new ArrayList<>();

        list.add("첫 번째, ");
        list.add("두 번째, ");
        list.add("세 번째, ");
        list.add("네 번째, ");
        list.add("다섯 번째");

        // ArrayList에 String 타입의 문자 5개 추가

        for (int i = 0; i < list.size(); i++)
        {
            stb.append(list.get(i));
            // 스트링 타입의 객체를 StringBuilder 타입의 변수인 sbr에 저장
        }

        System.out.println(stb);
        //stb에 저장된 문자 출력
    }

}

