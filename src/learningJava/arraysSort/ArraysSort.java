package learningJava.arraysSort;

import java.util.*;

//встроенная сортировка методом sort
public class ArraysSort {
    public static void main(String[] args) {

        String[] names = new String[] {"B", "F", "G", "Y", "A"};
        System.out.println(Arrays.toString(names));

        System.out.print("\nSorted: \n");
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
        }
        System.out.println(Arrays.toString(names));
    }
}