package BjAlgorithm.impl;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex25206 {

    public static void main(String[] args) throws IOException {

        // 20줄에 걸쳐 각 줄 마다 수강한 과목과 성적을 전공과목만 전공 평점을 구하는 문제

        Scanner sc = new Scanner(System.in);

        // 배열 크기 20
        String str[] = new String[20];

        //  전공평점(average) = [학점 × 과목평점]의 합(totalSum) / 학점의 총합(scoreSum)

        double totalSum = 0;
        double scoreSum = 0;


        String gradeList[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double gradeScore[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
        str[i] = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str[i], " ");

        String subject = st.nextToken();
        double score = Double.parseDouble(st.nextToken());
        String grade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (grade.equals(gradeList[j])) {

                    totalSum += score * gradeScore[j];

                    // P(=gradeList[9])은 계산 제외
                    if (j != 9) {
                        scoreSum += score;
                            }
                    }
                }
            }

        double average = totalSum / scoreSum;

        //문제에서 소수점 6자리까지만 나오도록 출력 요구
        System.out.printf("%.6f\n", average);

        sc.close();
    }
}
