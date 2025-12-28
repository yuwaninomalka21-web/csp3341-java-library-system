package com.library;

import com.library.model.*;

public class LibraryDemo {
    public static void main(String[] args) {
        System.out.println("=== Library Management System Demo ===\n");
        
        Book book1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch", "Programming");
        Book book2 = new Book("978-0596009205", "Head First Java", "Kathy Sierra", "Programming");
        Book book3 = new Book("978-0321356683", "Effective C++", "Scott Meyers", "Programming");
        Book book4 = new Book("978-1449355739", "Learning Python", "Mark Lutz", "Programming");
        
        System.out.println("--- Available Books ---");
        System.out.println(book1.getDetails());
        System.out.println(book2.getDetails());
        System.out.println(book3.getDetails());
        System.out.println(book4.getDetails());
        
        StudentMember student = new StudentMember("S001", "Alice Johnson");
        FacultyMember faculty = new FacultyMember("F001", "Dr. Bob Smith");
        PublicMember publicMember = new PublicMember("P001", "Charlie Brown");
        
        System.out.println("\n--- Registered Members ---");
        System.out.println(student);
        System.out.println(faculty);
        System.out.println(publicMember);
        
        System.out.println("\n--- Borrowing Books ---");
        student.borrowBook(book1);
        student.borrowBook(book2);
        faculty.borrowBook(book3);
        publicMember.borrowBook(book4);
        
        System.out.println("\n--- Current Status ---");
        student.displayBorrowedBooks();
        faculty.displayBorrowedBooks();
        publicMember.displayBorrowedBooks();
        
        System.out.println("\n--- Testing Borrowing Limits ---");
        student.borrowBook(book3);
        student.borrowBook(book4);
        
        System.out.println("\n--- Testing Unavailable Book ---");
        faculty.borrowBook(book1);
        
        System.out.println("\n--- Returning Books ---");
        student.returnBook(book1);
        
        System.out.println("\n--- Borrowing Returned Book ---");
        faculty.borrowBook(book1);
        
        System.out.println("\n--- Final Status ---");
        System.out.println("\nBooks:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        
        System.out.println("\nMembers:");
        System.out.println(student);
        System.out.println(faculty);
        System.out.println(publicMember);
        
        System.out.println("\n--- Member Type Comparison ---");
        System.out.println("Student: Max Books = " + student.getMaxBooks() + ", Loan Period = " + student.getLoanPeriodDays() + " days");
        System.out.println("Faculty: Max Books = " + faculty.getMaxBooks() + ", Loan Period = " + faculty.getLoanPeriodDays() + " days");
        System.out.println("Public:  Max Books = " + publicMember.getMaxBooks() + ", Loan Period = " + publicMember.getLoanPeriodDays() + " days");
    }
}
