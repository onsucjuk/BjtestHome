package Homework;

import java.util.Scanner;
import java.util.Stack;

public class Ex_4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s; // 문제에서 .이 마지막 문자라고 알려줌 <break 지점 받아오는 용도>

        while(true) {

            s = sc.nextLine();

            if(s.equals(".")){ // s가 "."이라면 멈추고 그 이전까지는 스택 메서드 실행.
                break;
            }
            System.out.println(discrim(s));
            // stack 연산 부분을 메서드로 선언
        }

        sc.close();
    }

    public static String discrim(String s) {
        // 메서드 명은 판별을 의미하는 discrimination를 줄여 discrim으로 선언

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '[') { // '('이거나 '[' 면 경우 스택에 넣는다. 즉, 일반 문자들은 넣지 않음.
                stack.push(c);
            }

            else if(c==')') {

                 if (stack.empty() || stack.peek() == '[' ) {
                    // 비어 있거나, 스택 맨 위의 값이 '[' 라면 짝이 안 맞으므로
                    return "no";
                }
                // 나머지는 '('와 ')'가 짝을 이루는 것이기 때문에 '('를 뺴준다(pop)
                else {
                    stack.pop();
                }
            }

            else if(c==']') {

                if (stack.empty() || stack.peek() == '(' ) {
                    // 비어 있거나, 스택 맨 위의 값이 '(' 라면 짝이 안 맞으므로
                    return "no";
                }
                // 나머지는 '['와 ']'가 짝을 이루는 것이기 때문에 '['를 뺴준다(pop)
                else {
                    stack.pop();
                }
            }
        }

        if (stack.empty()) {
            return "yes"; // 비어있으면 짝이 맞는 것이므로 "YES" 리턴
        }
        else {
            return "no"; // 모든 작업 수행 후 남아있다면 '('나 '[' 가 더 많다는 의미 이므로 "NO" 리턴
        }
    }
}
