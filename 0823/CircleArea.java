package javastart;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        
        final double PI = 3.14;

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("원의 반지름을 입력");
        double radius = scanner.nextDouble();

        
        double area = PI * radius * radius;

        
        System.out.printf("%.2fcm입니다.%n", area);

        
        scanner.close();
    }
}
