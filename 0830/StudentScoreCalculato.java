package com.joseph.practice;
import java.util.Scanner;

public class StudentScoreCalculato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수: ");
        int numStudents = scanner.nextInt();
        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "번째 학생 성적: ");
            scores[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        int average = sum / numStudents;

        System.out.println(">> 합계: " + sum);
        System.out.println(">> 평균: " + average);

        scanner.close();
    }
}

