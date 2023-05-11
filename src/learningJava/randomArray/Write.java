package learningJava.randomArray;

import java.io.*;

public class Write {
    public static void main(String[] args) {
        File fileOut = new File("C:\\Users\\Ivan and Mariia\\Desktop\\Обучение ИВАН\\для программ файлы\\Array.txt");
        try (OutputStream os = new FileOutputStream(fileOut, true)) {//+true дописывать в файл, иначе перезапись

            String text = "Ivan best";//переписать на массив
            os.write(text.getBytes());
            System.out.println("Content: " + text);//переписать на массив

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        } catch (IOException e) {
            System.out.println("Write error");
        }
    }
}
