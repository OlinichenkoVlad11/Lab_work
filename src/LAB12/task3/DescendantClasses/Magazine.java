package LAB12.task3.DescendantClasses;

import LAB12.task3.list.LibraryItem;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, int year, int issueNumber) {
        super(title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getInfo() {
        return "Magazine: " + title + ", Рік: " + year + ", Випуск: " + issueNumber;
    }
}
