package Homework;

import java.io.IOException;
import java.util.Scanner;
public class ArrayStack {
    int top; //배열의 인덱스
    int size; // 배열의 크기
    int[] stack; // int타입 배열 선언 stack

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(); // stack구조에 push, pop, size, top 등의 명령을 실행할 횟수 <첫 줄에 제시해 줌>

        ArrayStack stack = new ArrayStack(length); // 일단 push만 할 수도 있으므로 최대 stack크기는 length로 잡음

        for (int i = 0; i < length; i++) { // length만큼 명령어 반복하는 for문

            String s = sc.next();

            switch (s) { // 조건이 많으므로 if보다 switch문 사용
                case "push" : //  s가 push라면
                    stack.push(sc.nextInt()); break; // stack의 push(int item)메서드 사용 stack에 item추가, break(switch)
                case "pop" : // s가 pop이라면
                    stack.pop(); break; // pop()메서드 사용
                case "top" : // s가 top이라면
                    stack.top(); break; // top()메서드 사용
                case "size" : // s가 size라면
                    stack.size(); break;  // size() 메서드 사용
                case "empty" : // s가 empty라면
                    stack.empty(); break; // empty 메서드 사용
            }
        }
        sc.close(); // scanner 닫음
    }

    public ArrayStack(int size) { // stack에 size를 입력 받고 특정 크기(size)를 갖는 Stack생성하는 메서드
        this.size = size;
        stack = new int[size];
        top = -1; // 초기 top -1
    }

    public void push(int item) {
        stack[++top] = item; // 입력값(item)을 추가하고 인덱스(top)를 ++
    }

    public void pop() { // pop은 맨 위의 item(stack[top]의 값을 꺼내고 출력한다.)
        if(top==-1){ // 맨 위의 값이 0(값이 없으면) -1 출력
            System.out.println(-1);
        } else {
            int pop = stack[top]; // top의 값 꺼냄(int pop에 저장)
            System.out.println(pop); // int pop 출력
            stack[top--] = 0; // top의 값이 제거 되었으므로 top--, int 타입은 null 입력이 안되므로 0으로 초기화..
        }
    }

    public void empty() { // 비어있으면 1출력, 없으면 0출력
        if (top == -1)
            System.out.println(1);
        else
            System.out.println(0);
    }

    public void size() { // 스택에 들어가 있는 정수(item)의 수 출력
        System.out.println(top+1);
    }

    public void top() { // 스택 가장 위의 정수(item)출력, -1(없으면) -1출력
        if (top == -1)
            System.out.println(-1);
        else
            System.out.println(stack[top]);
    }
}