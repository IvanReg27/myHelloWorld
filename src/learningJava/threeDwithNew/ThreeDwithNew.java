package learningJava.threeDwithNew;

import java.util.Arrays;

public class ThreeDwithNew {
    public static void main(String[] args) {
        int[][][] a = new int[2][2][4];
        Integer[][] b = {{1,2,3,4,5,6,7,8,9,10},
                {21,22,23,24,25,26,27,28,29,30},
                {71,72,73,74,75,76,77,78,79,80}};
        System.out.println(Arrays.deepToString(a));
        System.out.println("---------------------------");
        System.out.println(Arrays.deepToString(b));
    }
}

