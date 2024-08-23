package javastart;

import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("변수 a");
        int a = scanner.nextInt();
        System.out.print("변수 b");
        int b = scanner.nextInt();

        
        int temp = a;
        a = b;
        b = temp;

        
        System.out.println("Swapping결과");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

       
        scanner.close();
    }
}
