package learningJava.randomArray;

public class RandomArray {
    public static void main(String[] args) {

        int r;
        int[] array = new int[10];
        for (r = 0; r < array.length; r++) {
            array[r] = (int) (Math.random() * 10);
            System.out.print(array[r] + "  ");
        }
    }
}