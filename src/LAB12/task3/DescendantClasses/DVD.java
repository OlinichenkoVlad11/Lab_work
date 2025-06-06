package LAB12.task3.DescendantClasses;

import LAB12.task3.Interface.Reservable;
import LAB12.task3.list.LibraryItem;

public class DVD extends LibraryItem implements Reservable {
    private String author;
    private boolean reserver = false;

    public DVD(String title, int year, String author) {
        super(title, year);
        this.author = author;
    }

    @Override
    public void reserve() {
        reserver = true;
    }

    public boolean isReserved() {
        return reserver;
    }

    @Override
    public String getInfo() {
        return "DVD: " + title + ", Рік: " + year + ", Автор: " + author + ", Зарезервовано: " + reserver;
    }
}