package learningJava.usersTaxHabReg;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

//пишем тест на проверку вхождения данных в коллекцию на примере ArrayList (имена работников и зарплата)

class CollectionTest {

    @Test
    void mainCollectionNameTest() {
        ArrayList<String> usersTaxHabReg = new ArrayList<>();
        usersTaxHabReg.addAll(Arrays.asList("Ivan", "Stanislav", "Irina", "Marina", "Inna", "Elena", "Tatyana", "Anastasia", "Eleonora", "Natalia"));
        assertEquals("Natalia", usersTaxHabReg.get(9));
    }

    @Test
    void mainCollectionSalaryTest() {
        ArrayList<Integer> usersTaxHabReg = new ArrayList<>();
        usersTaxHabReg.addAll(Arrays.asList(80000, 70000, 95000, 50000, 85000, 120000, 85000, 95000, 75000, 80000));
        assertEquals(120000, usersTaxHabReg.get(5));
    }
}

//тест пройден, значит созданная нами ранее коллекция работает, в ней имеются объекты (работники с полями (имя и зарплата))