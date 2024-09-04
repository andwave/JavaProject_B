package com.joseph.practice;

public class CountGreaterThan {
    public static int countGreaterThan(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num > target) {
                count++;
            }
        }
        return count;
    }
}
