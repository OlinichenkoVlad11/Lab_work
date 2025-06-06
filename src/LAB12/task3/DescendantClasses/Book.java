package LAB12.task3.DescendantClasses;

import LAB12.task3.list.LibraryItem;

public class Book extends LibraryItem {
    private int duration;
    public Book(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }
    @Override
    public String getInfo() {
        return String.format("Книга: %s (%d), Тривалість: %d days, В наявності: %s",
                title, year, duration, available ? "Так" : "ні");
    }
    public int getDuration() {
        return duration;
    }
}