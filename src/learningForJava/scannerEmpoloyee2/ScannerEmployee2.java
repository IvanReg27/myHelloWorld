package learningForJava.scannerEmpoloyee2;

import java.util.Scanner;

public class ScannerEmployee2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        String age = in.nextLine();
        System.out.print("Input status: ");
        String status = in.nextLine();
        System.out.println("Input birth: ");
        String birth = in.nextLine();
        System.out.println("Input phone: ");
        String phone = in.nextLine();
        System.out.printf("Name: %s Age: %s Status: %s Birth: %s Phone: %s \n", name, age, status, birth, phone);
        in.close();
    }
}
//записать данные в файл введенные в консоль не получается...