package LAB12.task3.list;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> searchByTitle(String keyword) {
        List<LibraryItem> results = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }

    public void borrowItem(LibraryItem item) {
        item.borrowItem();
    }

    public void returnItem(LibraryItem item) {
        item.returnItem();
    }

    public List<LibraryItem> getItems() {
        return items;
    }
}