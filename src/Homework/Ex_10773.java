package Homework;

import java.util.Scanner;
import java.util.Stack;

public class Ex_10773 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt(); // 첫 줄 숫자로 stack관련 메서드 실행 횟수 지정해주므로 int round로 받아옴.
        int hap = 0; // 최종적으로 hap을 출력하는 것이 문제의 요구 사항이므로 stack합을 받을 int 변수 지정.

        Stack<Integer> stack = new Stack<>(); // java.util 패키지의 stack활용해서 스택 선언

        for(int i = 0; i < round; i++ ) { // round(지정 실행 횟수)만큼 for문 실행한다.
            int num = sc.nextInt(); // 숫자를 받아옴. 문제에서 0이라면 숫자를 빼고(pop) 0이 아니라면 push한다고 함.

            if(num==0 && !stack.isEmpty()) // 0이 아니고 스택이 비어있지 않으면 pop() 실행
                stack.pop();
            else // 0이 아니라면 push() 실행
                stack.push(num);
        }

        while(!stack.isEmpty()) { // 스택에 값이 있다면 pop을 출력한다. <= 값이 없을 때까지 출력>
            hap += stack.pop();
            // hap에 스택의 정수를 더한다.
        }
        System.out.println(hap); // 합 출력
        sc.close();
    }
}
