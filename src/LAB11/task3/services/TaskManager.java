package LAB11.task3.services;

import LAB11.task3.errors.TaskNotFoundException;
import LAB11.task3.models.BaseTask;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class TaskManager {
    private List<BaseTask> tasks;
    private int taskCounter = 1;
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }    public void addTask(BaseTask task) {
        tasks.add(task);    }
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("✅ Завдань не знайдено.");
        } else {
            for (BaseTask task : tasks) {
                System.out.println(task);
            }
        }

    }    public void deleteTask(int id) throws TaskNotFoundException {
        Optional<BaseTask> task = tasks.stream().filter(t -> t.getId() == id).findFirst();
        if (task.isPresent()) {
            tasks.remove(task.get());
            System.out.println("🗑 Завдання успішно видалено.");
        } else {
            throw new TaskNotFoundException("Завдання з ID " + id + " Не знайдено.");
        }
    }
    public void markTaskAsDone(int id) throws TaskNotFoundException {
        for (BaseTask task : tasks) {
            if (task.getId() == id) {
                task.markAsDone();
                System.out.println("✅ Завдання позначено як виконане.");
                return;
            }
        }        throw new TaskNotFoundException("Завдання з ID " + id + " Не знайдено.");
    }    public int generateTaskId() {
        return taskCounter++;    }
}
