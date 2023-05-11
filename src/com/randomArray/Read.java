package com.randomArray;

import java.io.*;

public class Read {
    public static void main(String[] args) {

        File fileInput = new File("C:\\Users\\Ivan and Mariia\\Desktop\\Обучение ИВАН\\для программ файлы\\Array.txt");

        try (InputStream is = new FileInputStream(fileInput)) {
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println("Content: " + new String(bytes));//переписать на массив

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        } catch (IOException e) {
            System.out.println("Read error");
        }
    }
}

