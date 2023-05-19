package learningForJava.namesSort;

import java.util.Arrays;

//сортировка массива строк по алфавиту
public class NamesSort {
    public static void main(String[] args) {

        String[] names = new String[] {"Ivan", "Dmitriy", "Anna", "Sergey", "Bob"};
        System.out.println(Arrays.toString(names));

        System.out.print("\nSorted: \n");
        for(int j = 0; j < names.length; j++) {
            for(int i = j + 1; i < names.length; i++) {
                if(names[i].compareTo(names[j]) < 0) {
                    String t  = names[j];
                    names[j] = names[i];
                    names[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
