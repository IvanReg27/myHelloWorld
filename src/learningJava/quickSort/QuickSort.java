package learningJava.quickSort;

import java.util.Arrays;

//быстрая сортировка
public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        int[] r = {9, 0, 10, 15, 5, 6, 3, 12, 13, 2};
        System.out.println(Arrays.toString(r));

            int low = 0;
            int high = r.length - 1;

            quickSort(r, low, high);
        System.out.print("\nSorted: \n");
        System.out.println(Arrays.toString(r));
        }
    }