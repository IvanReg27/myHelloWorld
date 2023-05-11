package learningJava.selectionSort;

import java.util.Arrays;
import java.util.Random;

//сортировка выбором
public class SelectionSort {

    public static void main(String[] args) {

        int r;
        int[] array = new int[50];
        for (r = 0; r < array.length; r++) {
            array[r] = (int) (Math.random() * 100);
            System.out.print(array[r] + "  ");
        }
        System.out.print("\nSorted: \n");
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}