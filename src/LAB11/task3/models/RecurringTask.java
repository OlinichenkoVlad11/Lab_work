package LAB11.task3.models;

public class RecurringTask extends Task {
    private String repeatFrequency;
    public RecurringTask(int id, String title, String repeatFrequency) {
        super(id, title);
        this.repeatFrequency = repeatFrequency;
    }
    @Override    public String toString() {
        return super.toString() + ", Повторення: " + repeatFrequency;
    }
}


