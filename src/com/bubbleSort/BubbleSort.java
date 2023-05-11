package com.bubbleSort;

import java.util.Arrays;
import java.util.Random;

//сортировка пузырьком
public class BubbleSort {

    public static void main(String[] args) {

        int r;
        int[] array = new int[50];
        for(r = 0; r < array.length; r++) {
            array[r] = (int)(Math.random() * 100);
            System.out.print(array[r] + "  ");
        }
        System.out.print("\nSorted: \n");
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}