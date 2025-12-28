package com.library.model;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private boolean available;
    
    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void checkOut() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' has been checked out.");
        } else {
            System.out.println("Book '" + title + "' is not available.");
        }
    }
    
    public void checkIn() {
        if (!available) {
            available = true;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' was not checked out.");
        }
    }
    
    public String getDetails() {
        return String.format("ISBN: %s, Title: %s, Author: %s, Genre: %s, Available: %s",
                           isbn, title, author, genre, available ? "Yes" : "No");
    }
    
    @Override
    public String toString() {
        return title + " by " + author + (available ? " (Available)" : " (Borrowed)");
    }
}
