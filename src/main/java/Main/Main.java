package Main;

import se.yrgo.ToDoList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. Show Tasks\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    todoList.addTask(title);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.print("Enter task to remove: ");
                    String removeTitle = scanner.nextLine();
                    todoList.removeTask(removeTitle);
                    System.out.println("Task removed successfully.");
                    break;
                case 3:
                    System.out.println("Tasks:");
                    todoList.getTasks().forEach(task ->
                            System.out.println("- " + task.getTitle() + (task.isCompleted() ? " [Completed]" : ""))
                    );
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
