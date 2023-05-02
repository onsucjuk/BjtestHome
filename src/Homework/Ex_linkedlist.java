package Homework;
import java.util.*;

public class Ex_linkedlist {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // 입력값 받아옴
        String s = sc.nextLine();  // 한 줄로 받아옴(String타입)
        sc.close(); // sc 닫음(메모리 누수 방지)

        StringTokenizer st = new StringTokenizer(s,", ");
        // 한 줄로 입력 받은 값이 ", " 기준으로 나눠져있으니 나눠서 토큰 저장

        int length = st.countTokens();
        // 토큰 수 = Linkedlist에 추가할 횟수(값의 수)

        LinkedList<Integer> l = new LinkedList<Integer>();
        //LinkedList를 Integer타입으로 선언

        for(int i = 0; i < length; i++){ // 입력값(100, 200, 100, 300, 400) 5번 만큼 반복
                l.add(Integer.parseInt(st.nextToken()));
                // 토큰(Token)은 스트링 타입이므로 Integer타입으로 변환 후 Linkedlist에 추가
        }

        Collections.sort(l,Collections.reverseOrder());
        //컬렉션을 활용해서 내림차순 정렬 Collections.sort(l);은 오름차순 정렬

/*        for(int k:l) {
            if(k < length-1) {
                System.out.print(l.get(k)+", ");
            } else {
                System.out.print(l.get(k));
            } 2차 for문으로 ", "기준으로 출력하려했으나 조건을 못 넣겠음
        }*/
        for(int k = 0; k < length; k++){
                if(k < length-1) {
                    System.out.print(l.get(k)+", ");
                    // 마지막 출력 전(length-2)의 index까진 Linkedlist의 값 출력 후 ", "로 구분
                } else {
                    System.out.print(l.get(k));
                    // 마지막(length-1)은 구분이 필요 없기에 Linkedlist의 값만 출력
                }
        }
    }
}
