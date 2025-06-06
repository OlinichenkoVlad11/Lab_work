package LAB12.task3.list;

public abstract class LibraryItem {
    protected String title;
    protected int year;
    protected boolean available = true;

    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void borrowItem() {
        available = false;
    }

    public void returnItem() {
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public abstract String getInfo();
}

