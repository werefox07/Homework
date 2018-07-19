package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    invertArray();
    System.out.println();
    fillArray();
    System.out.println();
    changeArray();
    System.out.println();
    System.out.println();
    fillDiagonal();
    System.out.println();
    int[] a = findMaxAndMin();
    System.out.println("Минимальное число: " + a[0] + " Максимальное число: " + a[1]);
    }
    public static void invertArray() {
        int[] arr1 = {1, 0, 0, 1, 0, 1, 0, 1, 1};
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }
            System.out.print(arr1[i] + " ");
        }
    }
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i=0; i<arr.length; i++) {
            arr[i] = i*3;
            System.out.print(arr[i] + " ");
        }
    }
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<w.length; i++) {
            if (w[i] < 6) {
                w[i] *= 2;
            }
         System.out.print(w[i] + " ");
        }
    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i=0; i<arr.length; i++){
            arr[i][i] =1;
        }
        for (int i=0; i<arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static int[] findMaxAndMin() {
        int[] w = {12, 7, 5, 16, 39, 21};
        int max = w[0];
        int min = w[0];
        for(int i=1; i<w.length; i++) {
            if (max < w[i]) {
                max = w[i];
            }
            if (min > w[i]) {
                min = w[i];
            }
        }
        int[] number = {min, max};
        return number;
    }
}
