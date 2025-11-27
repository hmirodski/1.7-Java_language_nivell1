import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {

    @Test
    public void testWorkerSalary() {
        Worker w = new Worker("Worker", "Test", 10);
        double salary = w.calculateSalary(10);
        assertEquals(100, salary);
    }
}
