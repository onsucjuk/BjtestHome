package BjAlgorithm.impl;

import java.util.*;

public class Ex_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 세개를 제시해주고 세 정수를 곱한 정수의 각 자리수에 대해 (0~9) 등장 횟수를 출력하는 문제.
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int multi3 = num1 * num2 * num3;

        String num = Integer.toString(multi3);
        // Integer타입의 스트링으로 받음<레퍼런스타입>

        List<Integer> list = new LinkedList<>();
        //String이지만 Integer로 선언되어 있기 때문에 list에 저장 가능

        for(int i = 0; i < num.length(); i++) {
            list.add(num.charAt(i)-'0');
            //charAt메서드로 Char타입으로 각 자리수를 num의 길이만큼 축출하는데 - '0'(- 48)를 통해 10진수로 변환(정수Integer)
        }

        ArrayList<Integer> distinct = new ArrayList<>();
        // 기준인 0~9를 ArrayList 타입의 distinct 변수에 저장.
        for(int i = 0; i < 10; i++){
            distinct.add(i);
        }

        Map<Integer, Integer> rMap = new HashMap<>();
        // Map을 통해 키값을 distinct의 0~9까지를 Collections의 frequency 메서드를 통해 count(int타입)으로 등장 횟수 저장

        for (Integer zeronine : distinct){
            int count = Collections.frequency(list, zeronine);
            rMap.put(zeronine, count);
            // distinct의 정수의 값0~9까지를 zeronine(Integer타입의 변수)로 받고 list에 등장하는 빈도를 count로 저장
            // 키 값 zeronine(0~9), count(0~9가 list에 등장하는 횟수<빈도수>) 를 rMap(HashMap)에 (키값, value값)으로 저장

            System.out.println(count);
            // zeronine의 각 정수를 입력할 때마다 count를 출력
            // ArrayList(ditinct)에서 0~9까지 정렬되어 있기 때문에 순서대로 작업하므로 0~9까지의 빈도가 자연스레 출력 됌
        }
        sc.close();
    }
}
