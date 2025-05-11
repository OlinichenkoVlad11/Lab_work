package LAB11.task3.models;

public abstract class BaseTask {
    protected int id;
    protected String title;
    protected TaskStatus status;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;

    public BaseTask(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = TaskStatus.PENDING;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
    public void markAsDone() {
        this.status = TaskStatus.COMPLETED;
        this.updatedAt = LocalDateTime.now();
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public TaskStatus getStatus() {
        return status;
    }

