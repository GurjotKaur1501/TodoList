package se.yrgo;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskTest {
    @Test
    public void testMarkAsCompleted() {
        Task task = new Task("Buy milk");
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }
}
