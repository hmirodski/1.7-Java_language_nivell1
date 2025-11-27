import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnLineWorkerTest {
    @Test
    public void testOnLineWorkerSalary() {
        OnLineWorker w = new OnLineWorker("Test", "User", 10);

        double salary = w.calculateSalary(10);

        assertEquals(130, salary);
    }
}
