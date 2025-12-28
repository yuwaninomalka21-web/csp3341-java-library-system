package com.library.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Member {
    protected String memberId;
    protected String name;
    protected List<Book> borrowedBooks;
    
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public abstract int getMaxBooks();
    public abstract int getLoanPeriodDays();
    
    public String getMemberId() {
        return memberId;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }
    
    public int getBorrowedBooksCount() {
        return borrowedBooks.size();
    }
    
    public boolean canBorrow() {
        return borrowedBooks.size() < getMaxBooks();
    }
    
    public boolean borrowBook(Book book) {
        if (!canBorrow()) {
            System.out.println(name + " has reached the maximum borrowing limit of " + getMaxBooks() + " books.");
            return false;
        }
        
        if (!book.isAvailable()) {
            System.out.println("Book '" + book.getTitle() + "' is not available.");
            return false;
        }
        
        borrowedBooks.add(book);
        book.checkOut();
        System.out.println(name + " borrowed: " + book.getTitle());
        return true;
    }
    
    public boolean returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.checkIn();
            System.out.println(name + " returned: " + book.getTitle());
            return true;
        } else {
            System.out.println(name + " does not have this book.");
            return false;
        }
    }
    
    public void displayBorrowedBooks() {
        System.out.println("\n" + name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("  No books borrowed.");
        } else {
            for (int i = 0; i < borrowedBooks.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + borrowedBooks.get(i).getTitle());
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s (ID: %s) - %d/%d books borrowed", 
                           name, memberId, borrowedBooks.size(), getMaxBooks());
    }
}
