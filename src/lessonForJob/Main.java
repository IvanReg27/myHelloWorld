package lessonForJob;

import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInputStream fileIn = new FileInputStream("C:\\Users\\Ivan\\HelloWorld\\src\\resources\\input.txt");
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Ivan\\HelloWorld\\src\\resources\\output.txt");

        while (fileIn.available() > 0) {
            int oneByte = fileIn.read();
            fileOut.write(oneByte);
        }
        fileIn.close();
        fileOut.close();
    }
}