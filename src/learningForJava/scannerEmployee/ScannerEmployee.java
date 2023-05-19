package learningForJava.scannerEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    public String name;
    public String age;
    public String status;
    public String birth;
    public String phone;

    Employee(String name, String age, String status, String birth, String phone) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.birth = birth;
        this.phone = phone;
    }
}
public class ScannerEmployee {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", "34", "junior", "20.02.1988", "15-33"));
        employees.add(new Employee("Dmitriy", "34", "middle", "12.06.1988", "15-66"));
        employees.add(new Employee("Egor", "25", "middle", "22.10.1997", "15-56"));
        employees.add(new Employee("Sergey", "26", "middle", "15.08.1996", "15-99"));
        employees.add(new Employee("Michael", "22", "senior", "10.03.2000", "15-74"));

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myScanner.next();

        boolean isFound = false;
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                isFound = true;
                System.out.println("Found: " + employee.name + " " + employee.age + " " + employee.status + " " + employee.birth + " " + employee.phone);
            }
        }
        if(!isFound) System.out.println("Not found.");
    }
}
//записать данные в файл выведенные консолью не получается...