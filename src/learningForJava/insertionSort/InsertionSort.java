package learningForJava.insertionSort;

import java.util.Arrays;

//сортировка вставками
public class InsertionSort {

    public static void main(String[] args) {

        int r;
        int[] array = new int[50];
        for (r = 0; r < array.length; r++) {
            array[r] = (int) (Math.random() * 100);
            System.out.print(array[r] + "  ");
        }
        System.out.print("\nSorted: \n");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
