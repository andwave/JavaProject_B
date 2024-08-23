package javastart;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("정수를 입력하세요: ");
        int number = scanner.nextInt();

        
        if (number % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        
        scanner.close();
    }
}
