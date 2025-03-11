package se.yrgo;

import se.yrgo.ToDoList;
import java.util.List;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoListTest {
    @Test
    public void testAddTask() {
        ToDoList todoList = new ToDoList();
        todoList.addTask("Buy milk");
        List<Task> tasks = todoList.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Buy milk", tasks.get(0).getTitle());
    }
}
