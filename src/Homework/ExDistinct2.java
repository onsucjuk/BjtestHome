package Homework;

import java.util.*;

public class ExDistinct2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            num.add(sc.nextInt());
        }

        Set<Integer> distinct = new HashSet<>(num);

        Map<Integer, Integer> rMap = new HashMap<>();

        for (Integer i : distinct) {
            int count = Collections.frequency(num, i); // 숫자의 빈도수 (알아서 ++)
            rMap.put(i, count); // rMap에 숫자i와 등장 횟수 저장
        }

        List<Map.Entry<Integer, Integer>> sortResult = new LinkedList<>(rMap.entrySet());
        // 빈도수 결과를 정렬하기 위한 방법
        // Map은 순서가 없으므로 순서가 있는 List의 형태에 (키, 값)의 형태로 저장

        Collections.sort(sortResult, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        // 저장된 리스트 결과를 정렬

        System.out.println("가장 많이 등장한 숫자는? : " + sortResult);
    }
}
