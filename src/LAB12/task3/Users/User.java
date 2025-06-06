package LAB12.task3.Users;

import LAB12.task3.list.LibraryItem;

import java.util.*;

public class User {
    private String name;
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.borrowItem();
            borrowedItems.add(item);
        }
    }

    public void returnItem(LibraryItem item) {
        item.returnItem();
        borrowedItems.remove(item);
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }
}

