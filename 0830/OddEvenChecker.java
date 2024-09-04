package com.joseph.practice;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input, continueFlag;

        do {
            System.out.print("숫자를 입력하세요: ");
            input = scanner.nextInt();

            if (input % 2 == 0) {
                System.out.println(">> 짝수입니다.");
            } else {
                System.out.println(">> 홀수입니다.");
            }

            System.out.print("계속 하시겠습니까? (0-멈춤/1-계속): ");
            continueFlag = scanner.nextInt();
        } while (continueFlag == 1);

        scanner.close();
    }
}
