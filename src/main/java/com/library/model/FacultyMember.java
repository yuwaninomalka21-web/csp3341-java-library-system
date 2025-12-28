package com.library.model;

public class FacultyMember extends Member {
    private static final int MAX_BOOKS = 5;
    private static final int LOAN_PERIOD = 28;
    
    // Constructor
    public FacultyMember(String memberId, String name) {
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
        return "Faculty Member - " + super.toString() + " (Loan Period: " + LOAN_PERIOD + " days)";
    }
}
