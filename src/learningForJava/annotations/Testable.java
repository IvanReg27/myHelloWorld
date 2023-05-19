package learningForJava.annotations;

import org.junit.jupiter.api.Test;

public class Testable {
    public void execute() {
        System.out.println("Executing...");
    }
    @Test
    void testExecute() {execute();}
}
