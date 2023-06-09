package learningForJava.arrays;

import java.lang.reflect.*;
import java.util.*;

public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = { "Tom" , "Dick", "Harry" };
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will " + "generate an exception.");
        b = (String[]) badCopyOf(b, 10);
    }
    public static Object[] badCopyOf(Object[] a, int newLenght) {
        Object[] newArray = new Object[newLenght];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLenght));
        return newArray;
    }
    public static Object goodCopyOf(Object a, int newLenght) {
        Class cl = a.getClass();
        if (!cl.isArray()) return null;
        Class componentType = cl.getComponentType();
        int lenght = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLenght);
        System.arraycopy(a, 0, newArray, 0, Math.min(lenght, newLenght));
        return newArray;
    }
    }
