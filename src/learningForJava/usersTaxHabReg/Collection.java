package learningForJava.usersTaxHabReg;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        ArrayList<UsersTaxHabReg> usersTaxHabReg = new ArrayList<>();
        usersTaxHabReg.add(new UsersTaxHabReg("Ivan", 34, "Senior tax inspector", 621, 1533, 80000));
        usersTaxHabReg.add(new UsersTaxHabReg("Stanislav", 40, "Senior tax inspector", 621, 1535, 70000));
        usersTaxHabReg.add(new UsersTaxHabReg("Irina", 37, "Сhief tax inspector", 621, 1548, 95000));
        usersTaxHabReg.add(new UsersTaxHabReg("Marina", 59, "State tax inspector", 621, 1550, 50000));
        usersTaxHabReg.add(new UsersTaxHabReg("Inna", 50, "Senior tax inspector", 621, 1537, 85000));
        usersTaxHabReg.add(new UsersTaxHabReg("Elena", 59, "Chief", 708, 1455, 120000));
        usersTaxHabReg.add(new UsersTaxHabReg("Tatyana", 38, "Main tax inspector", 708, 1456, 85000));
        usersTaxHabReg.add(new UsersTaxHabReg("Anastasia", 48, "Main tax inspector", 708, 1458, 95000));
        usersTaxHabReg.add(new UsersTaxHabReg("Eleonora", 43, "Senior tax inspector", 708, 1460, 75000));
        usersTaxHabReg.add(new UsersTaxHabReg("Natalia", 49, "Senior tax inspector", 721, 1342, 80000));

        Collections.sort(usersTaxHabReg);
            for (UsersTaxHabReg e : usersTaxHabReg)

                System.out.println("name=" + e.getName() + ", age=" + e.getAge() + ", status=" + e.getStatus() + ", cabinetNumber=" + e.getCabinetNumber() + ", telephone=" + e.getTelephone() + ", salary=" + e.getSalary());
    }
}