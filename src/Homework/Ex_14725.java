package Homework;

import java.util.*;

public class Ex_14725 {
    public static void main(String[] args) {
        Map<String, String> map = null; // 리스트 구조 안에 저장될 Map 객체
        List<Map<String, String>> list = new ArrayList<>(); // 최종 저장되는 List 구조
        HashSet<String> keyarr = new HashSet<>(); // 키 값은 중복을 제거해서 가져와야하므로 HashSet사용

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();  // 개행 문자 소비

        for (int i = 0; i < num; i++) {

            String s = sc.nextLine();
            String arr[] = s.split(" ");

            int length = Integer.parseInt(arr[0]);
            String key = arr[1];
            keyarr.add(key);

            for (int j = 0; j < length - 1; j++) {

                map = new HashMap<>();
                map.put(key, arr[j + 2]);

                list.add(map);
                map = null;
            }

            ArrayList<String> keyarr2 = new ArrayList<>(keyarr);
            Collections.sort(keyarr2);


            for (int k = 0; k < list.size(); k++) {
                Map<String, String> rMap = list.get(k);

                System.out.println(keyarr2.get(0) + rMap.get(keyarr2.get(0)));
            }

        }
    }
}

