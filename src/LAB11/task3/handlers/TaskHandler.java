package LAB11.task3.handlers;

import LAB11.task3.errors.TaskNotFoundException;
import LAB11.task3.models.HighPriorityTask;
import LAB11.task3.models.RecurringTask;
import LAB11.task3.services.TaskManager;
import LAB11.task3.models.Task;

public class TaskHandler {
    private final TaskManager taskManager;

    public TaskHandler(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public void handleUserChoice(int choice) {
        try {
            switch (choice) {
                case 1 -> addTask();
                case 2 -> addRecurringTask();
                case 3 -> addHighPriorityTask();
                case 4 -> taskManager.listTasks();
                case 5 -> markTaskAsDone();
                case 6 -> deleteTask();
                default -> System.out.println("❌ Невірний вибір. Спробуйте знову.");
            }        } catch (TaskNotFoundException e) {
            System.out.println("❌ Помилка: " + e.getMessage());
        } finally {            System.out.println("Ця частина завжди виконується");
        }
    }
    private void addTask() {
        String title = UserInputHandler.getStringInput("Введіть назву завдання: ");
        taskManager.addTask(new Task(taskManager.generateTaskId(), title));
    }
    private void addRecurringTask() {
        String title = UserInputHandler.getStringInput("Введіть назву повторюваного завдання: ");
        String frequency = UserInputHandler.getStringInput("Введіть частоту повторення: ");
        taskManager.addTask(new RecurringTask(taskManager.generateTaskId(), title, frequency));
    }
    private void addHighPriorityTask() {
        String title = UserInputHandler.getStringInput("Введіть назву завдання з високим пріоритетом: ");
        int priority = UserInputHandler.getIntInput("Введіть рівень пріоритету (1-5): ");
        taskManager.addTask(new HighPriorityTask(taskManager.generateTaskId(), title, priority));
    }
    private void markTaskAsDone() throws TaskNotFoundException { // !! IMPORTANT
            int taskId = UserInputHandler.getIntInput("Введіть ідентифікатор завдання, щоб позначити його як виконане: ");
           taskManager.markTaskAsDone(taskId);
    }
    private void deleteTask() throws TaskNotFoundException { // !! IMPORTANT
             int taskId = UserInputHandler.getIntInput("Введіть ідентифікатор завдання для видалення: ");
             taskManager.deleteTask(taskId);
    }
}

