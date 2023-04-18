import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_maxfirst {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 리더 선언
        String s = br.readLine(); // 버퍼에 입력값(줄 단위)로 저장
        StringTokenizer st = new StringTokenizer(s, ", ");
        // 버퍼에 저장된 String 타입 s변수 불러와서 ", "를 기준으로 나눠 '스트링 토큰' 변수 'st'에 저장
        int[] arr = new int[st.countTokens()];
        //st에 저장된 '스트링 토큰'의 수가 배열 크기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            //'스트링 토큰'은 'String'타입이기 때문에 Integer(int의 레퍼클래스)로 변환 후 배열에 넣음
        }

        for (int j = arr.length-1; j > 0; j--) {
            //버블 정렬 두 개씩 비교하면서 작은 수 오른쪽으로 이동 정렬 시 마다 최소값이 오른쪽 고정
            // 가장 오르쪽은 최소값 고정되어 정렬 필요x j--, i는 갱신된 j 이하까지만 정렬 즉, 반복 기준 i < j
            for(int i = 0; i < j; i++) {
                if(arr[i]<arr[i+1]){
                    // 최대값이 앞(왼쪽)으로 와야하므로 arr[i]가 arr[i+1]보다 작다면 위치를 바꿔야함

                    int temp = arr[i+1];
                    // 먼저 i에서 i+1방향(오른쪽)으로 저장되기 됌. arr[i+1] 값이 arr[i]값으로 바뀜
                    // 하지만 a[i+1]은 이후에 a[i]에 저장되어야 하므로 a[i+1]을 int temp(임시)에 미리 저장
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                    // 순서대로 arr[i+1] 에 arr[i]값을 저장한다.
                    // 그 후 arr[i]은 미리 저장해둔 arr[i+1]의 값을 저장하고 있는 temp값을 저장한다.
                }
            }
        }
        for(int k =0; k < arr.length; k++){
            // 예상 출력 모양 400, 300, 200, 100, 100 이므로 처음엔 숫자만 이후로 ", 숫자" 형식으로 출력
            if (k==0){
                System.out.print(arr[k]); // k==0이면 처음이므로 숫자만 출력
            } else {
                System.out.print(", " + arr[k]); // 이후 마지막까지 ", 숫자" 형식으로 출력
            }
        }
    }
}
