package javastart;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("직사각형의 가로 길이를 입력하세요: ");
        double width = scanner.nextDouble();

        System.out.print("직사각형의 세로 길이를 입력하세요: ");
        double height = scanner.nextDouble();

        
        double area = width * height;

        
        System.out.printf("직사각형의 넓이는 %.1fcm 입니다.\n", area);

	}

}
