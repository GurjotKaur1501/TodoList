package se.yrgo;

import ;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList todoList = new TodoList();
        todoList.addTask("Buy milk");
        List<Task> tasks = todoList.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Buy milk", tasks.get(0).getTitle());
    }
}

