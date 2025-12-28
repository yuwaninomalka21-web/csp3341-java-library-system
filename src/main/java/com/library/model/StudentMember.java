package com.library.model;

public class StudentMember extends Member {
    private static final int MAX_BOOKS = 3;
    private static final int LOAN_PERIOD = 14;
    
    // Constructor
    public StudentMember(String memberId, String name) {
        super(memberId, name);
    }
    
    @Override
    public int getMaxBooks() {
        return MAX_BOOKS;
    }
    
    @Override
    public int getLoanPeriodDays() {
        return LOAN_PERIOD;
    }
    
    @Override
    public String toString() {
        return "Student Member - " + super.toString() + " (Loan Period: " + LOAN_PERIOD + " days)";
    }
}
