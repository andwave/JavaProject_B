package com.joseph.practice;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));
    }
}
