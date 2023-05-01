import java.util.Scanner;
public class Ex_10988 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close(); // sc 닫기 (메모리 누수 방지)

        String arr[] = s.split(""); // 라인 단위 단어 앞뒤 구분이기 때문에 라인 단위로 받은 단어 ""기준으로 정렬에 넣음
        int l = arr.length;
        int count = 0; // 같은 단어 수 체크용 변수

        for(int i = 0; i < l/2; i++) { // 전체 단어의 절반 기준 대칭 비교
            if (arr[i].equals(arr[l - i-1])) {
                // String타입은 프리미티브 타입이 아니기 때문에 == 연산자로 비교 불가능
                // 오브젝트 타입은 equals로 비교
                count++; // 만약 같다면 count++ 앞뒤가 같은 단어 수 체크용
            }
        }

        if(count == l/2) { // 같은 단어의 수를 체크한 count가 대칭수(l/2)와 같다면 앞뒤가 같은 단어. 뒤집어도 같은 단어.
            System.out.print(1); // 뒤집어도 같은 단어면 1출력
        } else {
            System.out.print(0); // 아니면 0출력
        }
        count = 0; // 변수 초기화
    }
}
