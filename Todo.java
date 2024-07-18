import java.util.Scanner;
import java.util.ArrayList;

public class Todo {
    // Class-level variable to hold the tasks
    static ArrayList<String> Task = new ArrayList<>();

    // Method to add a task
    static void addTask() {
        Scanner input = new Scanner(System.in);
        System.out.print("Task: ");
        String task = input.nextLine();
        Task.add(task);
        System.out.println("Task added.");
    }

    // Method to read tasks
    static void readTask() {
        if (Task.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < Task.size(); i++) {
                System.out.println((i+1) + ": " + Task.get(i));
            }
        }
    }

    // Method to update a task
    static void updateTask(int index) {
        if (index >= 0 && index < Task.size()) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter updated task: ");
            String newTask = input.nextLine();
            Task.set(index, newTask);
            System.out.println("Task updated.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to delete a task
    static void deleteTask(int index) {
        if (index >= 0 && index < Task.size()) {
            Task.remove(index);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tWelcome Vishal!");
        System.out.println();

        int check;
        while (true) {
            System.out.println("Add\tRead\tUpdate\tDelete\tExit");
            System.out.println(" 1 \t 2 \t  3 \t  4 \t  5 ");
            System.out.println();

            System.out.print("Enter Command here - ");
            check = sc.nextInt();

            if (check == 1) {
                addTask();
            } else if (check == 2) {
                readTask();
            } else if (check == 3) {
                System.out.print("Index to update: ");
                int updateIndex = sc.nextInt();
                updateTask(updateIndex);
            } else if (check == 4) {
                System.out.print("Task to delete: ");
                int deleteIndex = sc.nextInt();
                deleteTask(deleteIndex);
            } else if (check == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid command.");
            }
            System.out.println();
        }
        sc.close();
    }
}
