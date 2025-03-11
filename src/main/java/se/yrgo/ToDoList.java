package se.yrgo;

import se.yrgo.Task;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
    }

    public void removeTask(String title) {
        tasks.removeIf(task -> task.getTitle().equals(title));
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
