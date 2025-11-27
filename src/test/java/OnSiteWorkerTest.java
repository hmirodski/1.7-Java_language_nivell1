import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnSiteWorkerTest {

    @Test
    public void testOnSiteWorkerSalary() {
        OnSiteWorker.setPetrol(50);
        OnSiteWorker w = new OnSiteWorker("Test", "User", 10);

        double salary = w.calculateSalary(10);

        assertEquals(150, salary);
    }
}
